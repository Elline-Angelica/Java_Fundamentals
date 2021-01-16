package Chapter_21_FileIO.FoodShop.data;

import Chapter_21_FileIO.FoodShop.configuration.FilePaths;
import Chapter_21_FileIO.FoodShop.data.CustomerDao;
import Chapter_21_FileIO.FoodShop.model.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomerDaoImpl implements CustomerDao {
    public Customer readCustomer() {

        Customer customer = null;
        Path path = Paths.get(FilePaths.CUSTOMER_FILEPATH.getFile().getPath());

        try(BufferedReader reader = Files.newBufferedReader(path)) {
            String line = null;

            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");

                String name = parts[0];
                int id = Integer.parseInt(parts[1]);
                String email = parts[2];
                double money = Double.parseDouble(parts[3]);

                customer = new Customer(name,id,email,money);
            }
        } catch (IOException ex){
            System.out.println("Oops, something went wrong!");
            System.out.println(ex.getMessage());
        }
        return customer;
    }

    @Override
    public void writeCustomer(Customer customer) {
        StringBuilder sb = new StringBuilder();
        sb.append(customer.getName()).append(",")
                .append(customer.getID()).append(",")
                .append(customer.getEmail()).append(",")
                .append(customer.getMoney());

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePaths.CUSTOMER_FILEPATH.getFile(), false))){

            bufferedWriter.write(sb.toString());

        } catch (IOException ex){
            System.out.println("Oops, something went wrong!");
            System.out.println(ex.getMessage());
        }
    }

}

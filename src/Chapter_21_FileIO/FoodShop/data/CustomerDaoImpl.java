package Chapter_21_FileIO.FoodShop.data;

import Chapter_21_FileIO.FoodShop.configuration.FilePaths;
import Chapter_21_FileIO.FoodShop.model.Customer;

import java.io.FileWriter;
import java.io.IOException;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public Customer readCustomer() {
        return null;
    }

    @Override
    public void writeCustomer(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter(FilePaths.CUSTOMER_FILEPATH.getFile(), false);
            fileWriter.write(customer.toString() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

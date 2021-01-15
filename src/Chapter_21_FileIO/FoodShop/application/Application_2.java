package Chapter_21_FileIO.FoodShop.application;

import Chapter_21_FileIO.FoodShop.model.Customer;
import Chapter_21_FileIO.FoodShop.service.CustomerRepository;

public class Application_2 {
    public static void main(String[] args) {
        CustomerRepository cr = new CustomerRepository();
        Customer jeanJaque = new Customer("Jean", 12345, "JeanJacqueMetEenC@msn.be", 1000);

        cr.writeCustomer(jeanJaque);
        Customer customer = cr.readCustomer();
        System.out.println(customer);

    }
}

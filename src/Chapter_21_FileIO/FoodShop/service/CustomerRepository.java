package Chapter_21_FileIO.FoodShop.service;

import Chapter_21_FileIO.FoodShop.data.CustomerDao;
import Chapter_21_FileIO.FoodShop.data.CustomerDaoImpl;
import Chapter_21_FileIO.FoodShop.model.Customer;

public class CustomerRepository {
    CustomerDao customerDao = new CustomerDaoImpl();

    public void writeCustomer(Customer customer){
        customerDao.writeCustomer(customer);
    }

    public Customer readCustomer(){
        return customerDao.readCustomer();
    }
}

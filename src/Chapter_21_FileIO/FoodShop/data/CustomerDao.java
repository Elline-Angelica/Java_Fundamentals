package Chapter_21_FileIO.FoodShop.data;

import Chapter_21_FileIO.FoodShop.model.Customer;

public interface CustomerDao {

    Customer readCustomer();
    void writeCustomer(Customer customer);
}

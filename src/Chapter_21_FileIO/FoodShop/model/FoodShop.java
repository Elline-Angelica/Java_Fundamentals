package Chapter_21_FileIO.FoodShop.model;

import Chapter_21_FileIO.FoodShop.service.CustomerRepository;

import java.util.*;

public class FoodShop {
    private List<Register> registers = new LinkedList<>();
    private Stock stock;
    private CustomerRepository customerRepository;

    public FoodShop(){
        this.registers = new ArrayList<>();
        registers.add(new Register());
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Map<Food,Integer> sellFood(Order order, Customer customer){
        Map map = new HashMap();
        return map;
    }
}

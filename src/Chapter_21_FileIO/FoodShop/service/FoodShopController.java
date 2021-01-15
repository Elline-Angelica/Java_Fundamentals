package Chapter_21_FileIO.FoodShop.service;

import Chapter_21_FileIO.FoodShop.model.FoodShop;
import Chapter_21_FileIO.FoodShop.model.Stock;

public class FoodShopController {
    private FoodShop KFC = new FoodShop(new Stock());
    private CustomerRepository customerRepository = new CustomerRepository();
    private StockRepository stockRepository = new StockRepository();
}

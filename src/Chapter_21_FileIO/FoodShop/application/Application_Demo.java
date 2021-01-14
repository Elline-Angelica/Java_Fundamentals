package Chapter_21_FileIO.FoodShop.application;

import Chapter_21_FileIO.FoodShop.exception.FoodAlreadyInStockException;
import Chapter_21_FileIO.FoodShop.exception.FoodNotInStockException;
import Chapter_21_FileIO.FoodShop.model.Food;
import Chapter_21_FileIO.FoodShop.model.Stock;

import java.util.Map;

public class Application_Demo {
    public static void main(String[] args) {

        Stock stock = new Stock();
        Food sushi = new Food ("Sushi");
        Food sspork = new Food("Sweet and sour pork");
        Food cribs = new Food("Caramelised ribs");
        Food nuggets = new Food("Chicken Nuggets");
    }

    private static void addFood(Stock stock, Food food) {
        try {
            stock.addFood(food);
        } catch (FoodAlreadyInStockException faise){
            System.out.println(faise.getMessage());
        }
    }

    private static void addToStock(Stock stock, Food food, int amount){
        try {
            stock.addToStock(food,amount);
        } catch (FoodNotInStockException fnise) {
            System.out.println(fnise.getMessage());
        }
    }

    private static void removeFromStock(Stock stock, Food food, int amount){
        try {
            stock.addToStock(food,amount);
        } catch (FoodNotInStockException fnise){
            System.out.println(fnise.getMessage());
        }
    }

    private static void print(Stock stock) {
        Map<Food,Integer> foodStock = stock.getFoodStock();
        System.out.println("---------------FOOD STOCK---------------");
        for (Food food : foodStock.keySet()) {
            System.out.println(food.getName() + " - " + foodStock.get(food));
        }
        System.out.println("---------------------");
    }
}


package Chapter_21_FileIO_Foodshop.model;

import Chapter_21_FileIO_Foodshop.exception.FoodAlreadyInStockException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stock {
    private Map<Food,Integer> foodStock;

    public Map<Food, Integer> getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(Map<Food, Integer> foodStock) {
        this.foodStock = foodStock;
    }

    public void addFood(Food food) throws FoodAlreadyInStockException{ //add food to map
        if(food != null){
            Integer value = foodStock.putIfAbsent(food,1);
            if ( value == 0) {
                throw new FoodAlreadyInStockException("!Food " + food.getName() + " is already in stock");
            }
        }
    }

    public void removeFood(Food food){
        foodStock.remove(food);
    }

    public void removeFromStock(Food food, int amountToRemove){

    }

    public void addToStock(Food food, int amountToAdd){
        this.foodStock.put(food,amountToAdd);
    }
}

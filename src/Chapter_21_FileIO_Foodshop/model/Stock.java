package Chapter_21_FileIO_Foodshop.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stock {
    private Map<Food,Integer> foodStock = new HashMap<>();

    public Map<Food, Integer> getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(Map<Food, Integer> foodStock) {
        this.foodStock = foodStock;
    }

    public void addFood(Food food){
        if(food != null){
            foodStock.putIfAbsent(food,1);
        }
    }

    public void removeFood(Food food){
        foodStock.remove(food);
    }

    public void removeFromStock(Food food, int amountToRemove){

    }

    public void addToStock(Food food, int amountToAdd){

    }
}

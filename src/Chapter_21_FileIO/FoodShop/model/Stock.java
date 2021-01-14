package Chapter_21_FileIO.FoodShop.model;

import Chapter_21_FileIO.FoodShop.exception.FoodAlreadyInStockException;
import Chapter_21_FileIO.FoodShop.exception.FoodNotInStockException;
import Chapter_21_FileIO.FoodShop.exception.NotEnoughFoodInStockException;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Food,Integer> foodStock;

    {
        foodStock = new HashMap<>();
    }

    public Map<Food, Integer> getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(Map<Food, Integer> foodStock) {
        this.foodStock = foodStock;
    }

    public void addFood(Food food) throws FoodAlreadyInStockException { //add food to map
        if(food != null){
            Integer value = foodStock.putIfAbsent(food,1);
            if ( value == 0) {
                throw new FoodAlreadyInStockException("!Food " + food.getName() + " is already in stock");
            }
        }
    }

    public void removeFood(Food food){
        this.foodStock.remove(food);
    }

    public void addToStock(Food food, int amountToAdd) throws FoodNotInStockException {
        if(foodStock.containsKey(food)){
            int newAmount = foodStock.get(food) + amountToAdd;
            foodStock.replace(food,newAmount);
        } else {
            throw new FoodNotInStockException("Food " + food.getName() + " does not have stock");
        }

    }

    public void removeFromStock(Food food, int amountToRemove) throws NotEnoughFoodInStockException,FoodNotInStockException {
        if (!foodStock.containsKey(food)) {
            throw new NotEnoughFoodInStockException("There is not enough of " + food.getName() + " in stock. Stock: " + this.foodStock.get(food) + " | Trying to remove: " + amountToRemove);
        }

        if (this.foodStock.get(food) < amountToRemove) {
            throw new FoodNotInStockException("Food " + food.getName() + " does not have a stock!");
        } else {
            this.foodStock.replace(food, foodStock.get(food) - amountToRemove);
        }
    }
}

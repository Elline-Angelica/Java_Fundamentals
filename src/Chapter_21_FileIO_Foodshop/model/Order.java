package Chapter_21_FileIO_Foodshop.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Food,Integer> foodItems = new HashMap<>();
    private double percentDiscount;

    public Map<Food, Integer> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(Map<Food, Integer> foodItems) {
        this.foodItems = foodItems;
    }

    //public double getTotalPrice(){ }
}

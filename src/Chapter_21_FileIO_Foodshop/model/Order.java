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

   public double getTotalPrice(){
        Food food = new Food();
        double addPrice = food.getPrice();
        double totalPrice = 0;
        totalPrice += addPrice;
        return  totalPrice;
   }

    public double applyDiscount(double percent){
        double totalPriceAfterDiscount = 0;
        totalPriceAfterDiscount = getTotalPrice()-((percent/100)*getTotalPrice());
        return totalPriceAfterDiscount;
    }

    public double getDiscount(){
        return percentDiscount;
    }

}

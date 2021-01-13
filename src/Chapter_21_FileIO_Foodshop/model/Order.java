package Chapter_21_FileIO_Foodshop.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Order {
    private Map<Food,Integer> foodItems = new HashMap<>();
    private double percentDiscount;

    public Order(){
        this.foodItems = new HashMap<>();
    }

    public Map<Food, Integer> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(Map<Food, Integer> foodItems) {
        this.foodItems = foodItems;
    }

    public double applyDiscount(double percent){
        double totalPriceAfterDiscount = 0;
        totalPriceAfterDiscount = getTotalPrice()-((percent/100)*getTotalPrice());
        return totalPriceAfterDiscount;
    }

    public double getDiscount(){
        return percentDiscount;
    }

    public double getTotalPrice(){
       Set<Map.Entry<Food,Integer>> foodSet = foodItems.entrySet();
       double totalPrice = foodSet.stream()
               .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
               .sum();
       double priceAfterDiscount = totalPrice - (totalPrice/100*percentDiscount);
       return priceAfterDiscount;
    }
}

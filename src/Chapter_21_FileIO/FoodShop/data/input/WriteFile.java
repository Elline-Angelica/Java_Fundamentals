package Chapter_21_FileIO.FoodShop.data.input;

import Chapter_21_FileIO.FoodShop.model.Food;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFile {
    public static void write(Map<Food, Integer> foodStock){
        // write stock to a file

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("FoodStock.txt", false))){
            Set<Map.Entry<Food, Integer>> foodSet = foodStock.entrySet();
            foodSet.forEach(item -> {
                try {
                    writer.write(item.getKey().toString() + " " + item.getValue() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException ex){
            System.out.println("Oops, something went wrong!");
            System.out.println(ex.getMessage());
        }
    }
}

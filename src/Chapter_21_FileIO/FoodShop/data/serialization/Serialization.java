package Chapter_21_FileIO.FoodShop.data.serialization;

import Chapter_21_FileIO.FoodShop.model.FoodShop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void serialize(FoodShop foodShop){
        try(FileOutputStream file = new FileOutputStream("foodshop.ser");
            ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(foodShop); // write foodShop object to file
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

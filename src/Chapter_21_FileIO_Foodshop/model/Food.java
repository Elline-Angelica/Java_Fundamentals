package Chapter_21_FileIO_Foodshop.model;

import java.util.Objects;

public class Food {
    private String name;
    private double price;
    private double calorie;
    private String brand;

    public Food (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //TODO Override equals method - For contains method

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(food.price, price) == 0 &&
                Double.compare(food.calorie, calorie) == 0 &&
                Objects.equals(name, food.name) &&
                Objects.equals(brand, food.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,price,calorie,brand);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calorie=" + calorie +
                ", brand='" + brand + '\'' +
                '}';
    }
}

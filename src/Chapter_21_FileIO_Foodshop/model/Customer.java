package Chapter_21_FileIO_Foodshop.model;

public class Customer {
    private String name;
    private final int id;
    private String email;
    private double money;

    public Customer(String name, int id, String email, double money) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

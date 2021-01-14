package Chapter_21_FileIO.FoodShop.model;


import Chapter_21_FileIO.FoodShop.exception.NotEnoughMoneyInRegisterException;

public class Register {
    private double money;

    public double getMoney() {
        return money = 0;
    }

    public void addMoney(double moneyToAdd) {
        this.money += moneyToAdd;
    }

    public void deductMoney(double moneyToDeduct) throws NotEnoughMoneyInRegisterException {
        if (moneyToDeduct > money) {
            throw new NotEnoughMoneyInRegisterException("");
        } else {
            this.money -= moneyToDeduct;
        }
    }
}

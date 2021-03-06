package Chapter_21_FileIO.FoodShop.model;

import Chapter_21_FileIO.FoodShop.exception.NotEnoughMoneyInRegisterException;

public class Register {
    private double money;


    public Register() {
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }

    public void addMoney(double moneyToAdd){
        this.money += moneyToAdd;
    }

    public void deductMoney(double moneyToDeduct) throws NotEnoughMoneyInRegisterException {
        if(moneyToDeduct > this.money){
            throw new NotEnoughMoneyInRegisterException(new StringBuilder().append("There is not enough money in the " +
                    "register to proceed this ").append("transaction. Register: " + money + "€ | Trying to deduct: " +
                    "\" + moneyToDeduct + \"€\"").toString());
        }
        this.money -= moneyToDeduct;
    }

}

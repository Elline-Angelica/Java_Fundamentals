package Chapter_15_Exceptions.AdditionalExcercises;
import Chapter_15_Exceptions.AdditionalExcercises.Exceptions.GameShopException;

import java.time.LocalDate;
public class GameShopApp {
    public static void main(String[] args) {

        GameShop gameShop = new GameShop(new Human("Elline", LocalDate.of(1988, 06, 14)));
        Stock stock = new Stock();
        stock.setAvengersAmount(1);
        stock.setCallOfDutyAmount(0);
        stock.setFifa21Amount(2);
        stock.setFortniteAmount(1);
        stock.setRobloxAmount(1);

        Client Elline = new Client("Terry", LocalDate.of(2000, 06, 14));
        Elline.setMoney(20);

        GameShop.Game game = null;
        try {
            game = gameShop.buyGame(GameShop.Game.CALL_OF_DUTY.getName(), Elline);
            Elline.play(game);
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        try {
            game = gameShop.buyGame(GameShop.Game.FIFA21.getName(), Elline);
            Elline.play(game);
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        try {
            game = gameShop.buyGame(GameShop.Game.FIFA21.getName(),Elline);
            Elline.play(game);
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }
    }
}

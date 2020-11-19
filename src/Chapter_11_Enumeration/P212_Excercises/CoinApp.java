package Chapter_11_Enumeration.P212_Excercises;

public class CoinApp {
    public static void main(String[] args) {
      /*
        Coin euro = Coin.FIVE_EURO;
        Coin cent = Coin.FIFTY_CENT;
        Coin ask = Coin.TWENTY_CENT;

        System.out.println(euro);
        System.out.println(cent);
        System.out.println(ask.isEuro());
       */

        Coin[] allPossibleCoins = Coin.values();

       // Coin valueOfVar = Coin.valueOf("ONE_CENT");
       // System.out.println(valueOfVar);

        for(Coin allPossibleCoin : allPossibleCoins){
            System.out.println(allPossibleCoin);
        }



    }
}

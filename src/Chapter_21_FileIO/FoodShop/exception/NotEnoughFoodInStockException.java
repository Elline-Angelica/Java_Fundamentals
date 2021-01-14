package Chapter_21_FileIO.FoodShop.exception;

public class NotEnoughFoodInStockException extends Throwable {
    public NotEnoughFoodInStockException(String s) {
    }

    public NotEnoughFoodInStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughFoodInStockException(Throwable cause) {
        super(cause);
    }

    public NotEnoughFoodInStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NotEnoughFoodInStockException() {
    }
}

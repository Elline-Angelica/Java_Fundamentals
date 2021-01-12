package Chapter_21_FileIO_Foodshop.exception;

public class FoodNotInStockException extends Throwable {
    public FoodNotInStockException(String s) {

    }

    public FoodNotInStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodNotInStockException(Throwable cause) {
        super(cause);
    }

    public FoodNotInStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public FoodNotInStockException() {
    }
}

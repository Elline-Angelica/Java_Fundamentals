package Chapter_21_FileIO_Foodshop.exception;

public class FoodAlreadyInStockException extends Throwable {
    public FoodAlreadyInStockException() {
    }

    public FoodAlreadyInStockException(String s) {

    }

    public FoodAlreadyInStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodAlreadyInStockException(Throwable cause) {
        super(cause);
    }

    public FoodAlreadyInStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

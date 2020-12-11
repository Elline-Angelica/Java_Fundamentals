package Chapter_15_Exceptions.AdditionalExcercises.Exceptions;

public class EmptyStockException extends GameShopException  {
    public EmptyStockException(){
        super();
    }

    public EmptyStockException(String message){
        super(message);
    }

    public EmptyStockException(String message, Throwable cause){
        super(message, cause);
    }

    public EmptyStockException(Throwable cause){
        super(cause);
    }
}

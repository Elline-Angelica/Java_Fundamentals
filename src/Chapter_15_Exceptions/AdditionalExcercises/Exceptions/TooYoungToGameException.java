package Chapter_15_Exceptions.AdditionalExcercises.Exceptions;

public class TooYoungToGameException extends GameShopException {
    public TooYoungToGameException(){
        super();
    }

    public TooYoungToGameException(String message){
        super(message);
    }

    public TooYoungToGameException(String message, Throwable cause){
        super(message, cause);
    }

    public TooYoungToGameException(Throwable cause){
        super(cause);
    }
}

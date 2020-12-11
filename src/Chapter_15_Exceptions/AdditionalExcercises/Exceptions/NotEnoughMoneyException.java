package Chapter_15_Exceptions.AdditionalExcercises.Exceptions;

public class NotEnoughMoneyException  extends GameShopException{
    public NotEnoughMoneyException(){
        super();
    }

    public NotEnoughMoneyException(String message){
        super(message);
    }

    public NotEnoughMoneyException(String message, Throwable cause){
        super(message, cause);
    }

    public NotEnoughMoneyException(Throwable cause){
        super(cause);
    }
}

package Chapter_11_Enumeration.P212_Excercises;

public enum Coin { //identifiers of object
    ONE_CENT(false,1),
    TWO_CENT(false,2),
    FIVE_CENT(false,3),
    TEN_CENT(false,3),
    TWENTY_CENT(false,20),
    FIFTY_CENT(false,50),
    ONE_EURO(true,100),
    TWO_EURO(true,200),
    FIVE_EURO(true,500);

    private boolean isEuro;
    private int centValue;

    Coin(boolean isEuro, int centValue){
        this.isEuro = isEuro;
        this.centValue = centValue;

    }

    public boolean isEuro() {
        return isEuro;
    }

    public void setEuro(boolean euro) {
        isEuro = euro;
    }

    public int getCentValue() {
        return centValue;
    }

    public void setCentValue(int centValue) {
        this.centValue = centValue;
    }

    @Override
    public String toString() {
        if(isEuro){
            return (centValue/100) + " Euro";
        } else {
            return centValue + " Cent";
        }
    }
}




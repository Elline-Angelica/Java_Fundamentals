package Chapter_09_ClassRelations;

public class P174_HigherLowerGame {

    private static int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static String guessMethod(int guessValue) {
            if (guessValue < value) {
                return "Higher";
            } else if (guessValue > value) {
                return "Lower";
            } else {
                return "Got it!";
            }
    }
}

//BOOK
    /* public HigherLowerGame(int upperbound) {
        this.max = upperbound;
        this.rand = new Random();
        reset();
    }

    public void reset(){
        value = rand.nextInt(max +1);
    }

    public  int guessMethod(int guessValue) {
        if (guessValue < value) {
            return -1;
        } else if (guessValue > value) {
            return 1;
        } else {
            return 0;
        }
    } */

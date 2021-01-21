package Chapter_24_Multithreading.Excercises.EXC1_P421;

public class PrintApp {

    //Creating threads

    public static void main(String[] args) {
        PrintThread thread = new PrintThread('*',100);
        PrintThread thread1 = new PrintThread('#',100);
        thread.start();
        thread1.start();

    }
}

package Chapter_24_Multithreading.Excercises.EXC3_P427;

public class PrintAppLambda {
    public static void main(String[] args) {

        System.out.println("Available processors:");
        System.out.println(Runtime.getRuntime().availableProcessors());

        Thread thread1 = new Thread(()-> print('#',100));
        Thread thread2 = new Thread(()-> print('*',100));
        System.out.println("Before start()");
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread1.start();
        System.out.println("After start()");
        System.out.println(thread1.getState());
        thread2.start();
        System.out.println(thread2.getState());

    }

    public static void print(char c, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(c);
            Thread.yield();
        }
    }
}

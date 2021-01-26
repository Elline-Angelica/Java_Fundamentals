package Chapter_24_Multithreading.Excercises.EXC7_P433_EXC8_P437;

public class CounterAppLambda {
    public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();
    Thread thread1 = new Thread(()-> increment(counter, 10000));
    Thread thread2 = new Thread(()-> increment(counter, 10000));
    Thread thread3 = new Thread(()-> decrement(counter, 5000));
    Thread thread4 = new Thread(()-> decrement(counter, 5000));
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    try {
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println(counter.getCount()); //output 11581
        //After synchronizing output = 20000
}

    private static void increment(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.increment();
        }
    }

    private static void decrement(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.decrement();
        }
    }

}

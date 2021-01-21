package Chapter_24_Multithreading.Excercises.EXC2_P423;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> print('#',100));
        Thread thread2 = new Thread(()-> print('*',100));
        thread1.start();
        thread2.start();
    }

    public static void print(char c, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}

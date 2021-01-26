package Chapter_24_Multithreading.Excercises.EXC7_P433_EXC8_P437;

public class Counter {
    private int count = 0;
    //private Object monitor = new Object(); -> hoeft eigenlijk geen object aan te maken of extra codebolk bij methodes

    public synchronized void increment(){
            count++;
    }

    public synchronized void decrement(){
            count--;
    }

    public int getCount(){
        return count;
    }
}

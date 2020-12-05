package Chapter_17_GenericClasses.P277;

public class MixedDuo <E, T>{
    private E first;
    private T second;

    public MixedDuo(E first, T second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

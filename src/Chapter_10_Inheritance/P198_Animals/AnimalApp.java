package Chapter_10_Inheritance.P198_Animals;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat ("Minnie");
        System.out.println(cat.toString());

        Bird bird = new Bird("Tweetie");
        System.out.println(bird);

        Animal fish = new Fish("Nemo");
        System.out.println(fish);

        Snake snake = new Snake("Adam");
        System.out.println(snake);
    }

}

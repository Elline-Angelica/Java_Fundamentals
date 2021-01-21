package Chapter_24_Multithreading.Demo;

public class FootballApp {
    public static void main(String[] args) {
        Snowkids team = new Snowkids(100);
        Thread mert = new PlayerThread("Christiano Mert",team);
        Thread jean = new PlayerThread("Jean-Pierre-Marie",team);
        Thread matteo = new PlayerThread("(Niet Christiano)Matteo",team);
        Thread microIce = new PlayerThread("Micro Ice",team);

        mert.start();
        jean.start();
        matteo.start();
        microIce.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("THIS MATCH IS AMAZING" + i);
        }


    }
}

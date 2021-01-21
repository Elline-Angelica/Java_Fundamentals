package Chapter_24_Multithreading.Demo;

public class PlayerThread extends Thread {

    private String name;
    private Snowkids team;

    public PlayerThread(String name,Snowkids team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int fans = team.getTotalFans();
        }
    }
}

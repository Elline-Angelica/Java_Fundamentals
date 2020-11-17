package be.intecbrussel.MediaInterfaces;

public class AdapterPatternMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "my hair.mp3");
        audioPlayer.play("mp4", "positions.mp4");
        audioPlayer.play("vlc", "34+35.vlc");
        audioPlayer.play("avi", "pov");

    }
}

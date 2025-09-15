package src;

public class MusicPlayer implements Device {
    @Override
    public void on() {
        System.out.println("Music Player is ON. Playing default playlist.");
    }

    @Override
    public void off() {
        System.out.println("Music Player is OFF");
    }

    public void playPlaylist(String playlist) {
        System.out.println("Playing playlist: " + playlist);
    }
}

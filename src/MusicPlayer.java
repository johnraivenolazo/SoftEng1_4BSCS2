package src;

public class MusicPlayer implements Device {
    private int volume = 50; // Default volume

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

    public void setVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to " + level + "%");
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Volume increased to " + volume + "%");
        } else {
            System.out.println("Volume is already at maximum");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Volume decreased to " + volume + "%");
        } else {
            System.out.println("Volume is already at minimum");
        }
    }
}

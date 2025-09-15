package src;

public class Light implements Device {
    @Override
    public void on() {
        System.out.println("Light is ON. Brightness set to 70%");
    }

    @Override
    public void off() {
        System.out.println("Light is OFF");
    }

    public void setBrightness(int level) {
        System.out.println("Brightness set to " + level + "%");
    }
}

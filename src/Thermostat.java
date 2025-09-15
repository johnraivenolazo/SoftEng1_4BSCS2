package src;

public class Thermostat implements Device {
    private int temperature = 22; // Default temperature

    @Override
    public void on() {
        System.out.println("Thermostat is ON. Temperature set to 22°C");
    }

    @Override
    public void off() {
        System.out.println("Thermostat is OFF");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature set to " + temp + "°C");
    }

    public void increaseTemperature() {
        temperature += 1;
        System.out.println("Temperature increased to " + temperature + "°C");
    }

    public void decreaseTemperature() {
        temperature -= 1;
        System.out.println("Temperature decreased to " + temperature + "°C");
    }
}
package src;

public class Thermostat implements Device {
    @Override
    public void on() {
        System.out.println("Thermostat is ON. Temperature set to 22°C");
    }

    @Override
    public void off() {
        System.out.println("Thermostat is OFF");
    }

    public void setTemperature(int temp) {
        System.out.println("Temperature set to " + temp + "°C");
    }
}
package src;

public class SmartHomeTest {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Commands
        Command lightOn = new TurnOnCommand(livingRoomLight);
        Command lightOff = new TurnOffCommand(livingRoomLight);

        Command thermostatOn = new TurnOnCommand(thermostat);
        Command thermostatOff = new TurnOffCommand(thermostat);

        Command musicOn = new TurnOnCommand(musicPlayer);
        Command musicOff = new TurnOffCommand(musicPlayer);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Test Light
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(lightOff);
        remote.pressButton();

        // Test Thermostat
        remote.setCommand(thermostatOn);
        remote.pressButton();
        remote.setCommand(thermostatOff);
        remote.pressButton();

        // Test Music Player
        remote.setCommand(musicOn);
        remote.pressButton();
        remote.setCommand(musicOff);
        remote.pressButton();
    }
}

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
        Command increaseTemp = new IncreaseTempCommand(thermostat);

        Command musicOn = new TurnOnCommand(musicPlayer);
        Command musicOff = new TurnOffCommand(musicPlayer);
        Command decreaseVolume = new DecreaseVolumeCommand(musicPlayer);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Test Light
        System.out.println("=== Testing Light ===");
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.setCommand(lightOff);
        remote.pressButton();

        // Test Thermostat
        System.out.println("\n=== Testing Thermostat ===");
        remote.setCommand(thermostatOn);
        remote.pressButton();
        remote.setCommand(increaseTemp);
        remote.pressButton();
        remote.setCommand(thermostatOff);
        remote.pressButton();

        // Test Music Player
        System.out.println("\n=== Testing Music Player ===");
        remote.setCommand(musicOn);
        remote.pressButton();
        remote.setCommand(decreaseVolume);
        remote.pressButton();
        remote.setCommand(musicOff);
        remote.pressButton();
    }
}

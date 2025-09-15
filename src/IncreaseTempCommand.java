package src;

public class IncreaseTempCommand implements Command {
    private Thermostat thermostat;

    public IncreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}
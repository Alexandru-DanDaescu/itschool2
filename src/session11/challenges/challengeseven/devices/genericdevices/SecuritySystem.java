package session11.challenges.challengeseven.devices.genericdevices;

public abstract class SecuritySystem extends GenericDevice{

    protected SecuritySystem(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }

    public abstract void setAlertMode();

}

package session11_abstraction.challenges.challengeseven.devices.genericdevices;

public abstract class ThermostatSystem extends GenericDevice{
    protected ThermostatSystem(String deviceName,double energyConsumption){
        super(deviceName, energyConsumption);
    }
}

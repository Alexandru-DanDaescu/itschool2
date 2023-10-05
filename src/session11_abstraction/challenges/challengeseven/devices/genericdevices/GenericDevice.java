package session11_abstraction.challenges.challengeseven.devices.genericdevices;

public abstract class GenericDevice {

    private String deviceName;
    private double energyConsumption;

    protected GenericDevice(String deviceName,double energyConsumption){
        this.deviceName = deviceName;
        this.energyConsumption = energyConsumption;
    }


    public abstract void turnOn();
    public abstract void turnOff();

    public String getDeviceName(){
        return deviceName;
    }
    public double getEnergyConsumption(){
        return energyConsumption;
    }

}

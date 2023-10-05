package session11_abstraction.challenges.challengeseven.devices.genericdevices;

import session11_abstraction.challenges.challengeseven.devices.interfacesfordevices.DeviceSavePower;
import session11_abstraction.challenges.challengeseven.devices.interfacesfordevices.NightMode;

public class AirConditionerSystem extends GenericDevice implements NightMode, DeviceSavePower {
    protected AirConditionerSystem(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }


    @Override
    public void turnOn(){
        System.out.println("The air conditioner is turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("the air conditioner is turned off");
    }


    @Override
    public void setDeviceSavePower() {

    }

    @Override
    public void setNightMode() {

    }
}

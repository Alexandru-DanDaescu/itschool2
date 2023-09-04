package session11.challenges.challengeseven.devices.genericdevices;

import session11.challenges.challengeseven.devices.interfacesfordevices.AlertMode;

public class DoorSystem extends SecuritySystem implements AlertMode {

    private int closeDoor;
    private int lockDoor;

    protected DoorSystem(String deviceName,double energyConsumption){
        super(deviceName, energyConsumption);
    }



    @Override
    public void setAlertMode(){
        System.out.println("Door is closed.");
        closeDoor = 1;
        System.out.println("Door is locked.");
        lockDoor = 1;
    }

    @Override
    public void turnOn(){

    }
    @Override
    public void turnOff(){

    }

}

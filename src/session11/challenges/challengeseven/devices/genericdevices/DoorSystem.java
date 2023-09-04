package session11.challenges.challengeseven.devices.genericdevices;



public class DoorSystem extends SecuritySystem {

    private int closeDoor;
    private int lockDoor;

    protected DoorSystem(String deviceName,double energyConsumption){
        super(deviceName, energyConsumption);
    }



    @Override
    public void setAlertMode(){
        closeDoor = 1;
        System.out.println("Door is closed.");
        lockDoor = 1;
        System.out.println("Door is locked.");
    }

    @Override
    public void turnOn(){

    }
    @Override
    public void turnOff(){

    }

}

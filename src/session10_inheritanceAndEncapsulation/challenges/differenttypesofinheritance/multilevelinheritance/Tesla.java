package session10_inheritanceAndEncapsulation.challenges.differenttypesofinheritance.multilevelinheritance;

import java.time.LocalDate;

public class Tesla extends ElectricCar{

    private float autoPilotVersion;

    public Tesla(String make, String model, LocalDate year, int batteryCapacity, int range, float autoPilotVersion){
        super(make, model, year, batteryCapacity, range);
        this.autoPilotVersion = autoPilotVersion;
    }

    public void enableAutoPilot(){
        System.out.println("Autopilot has been engaged");
    }
    @Override
    public String toString(){
        return super.toString()+this.autoPilotVersion;
    }

}

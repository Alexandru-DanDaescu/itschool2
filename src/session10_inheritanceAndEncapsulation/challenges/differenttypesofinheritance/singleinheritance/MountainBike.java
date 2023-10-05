package session10_inheritanceAndEncapsulation.challenges.differenttypesofinheritance.singleinheritance;

public class MountainBike extends Bicycle{

    private String tyreType;
    private String suspension;
    public MountainBike(double speed, int gear,String tyreType, String suspension){
        super(speed,gear);
        this.tyreType = tyreType;
        this.suspension = suspension;
    }

    public void adjustSuspension(){
        this.tyreType = "The tyres are of tubular type";
        this.suspension = "The suspension has been adjusted accordingly";
    }

    @Override
    public String toString(){
        return super.toString()+this.tyreType+" "+this.suspension;
    }



}

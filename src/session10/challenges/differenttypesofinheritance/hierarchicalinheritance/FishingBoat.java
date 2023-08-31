package session10.challenges.differenttypesofinheritance.hierarchicalinheritance;

public class FishingBoat extends Boat{

    private double fishCapacity;
    private String typeOfNet;
    public FishingBoat(double length, double width, double weight, String model, double fishCapacity, String typeOfNet) {
        super(length, width, weight, model);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet(){
        System.out.println("The net has been cast");
    }

    @Override
    public String toString() {
        return super.toString() + this.fishCapacity + " " + this.typeOfNet;
    }
}

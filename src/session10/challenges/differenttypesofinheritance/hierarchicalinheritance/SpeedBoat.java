package session10.challenges.differenttypesofinheritance.hierarchicalinheritance;

public class SpeedBoat extends Boat{

    private int maxSpeed;
    private String engineType;
    public SpeedBoat(double length, double width, double weight, String model,int maxSpeed, String engineType) {
        super(length, width, weight, model);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost(){
        this.maxSpeed += 50;
    }

    @Override
    public String toString() {
        return super.toString() + this.maxSpeed + " " + this.engineType;
    }
}

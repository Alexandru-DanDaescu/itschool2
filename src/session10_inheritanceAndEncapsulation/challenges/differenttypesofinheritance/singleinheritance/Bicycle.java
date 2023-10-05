package session10_inheritanceAndEncapsulation.challenges.differenttypesofinheritance.singleinheritance;

public class Bicycle {

    private double speed;
    private int gear;
    public Bicycle(double speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public int changeGear(){
        return gear += 1;
    }

    public double speedUp(){
        return speed += 5.0;
    }

    public void applyBrake(){
        this.gear = 0;
        this.speed = 0;
    }

    public String toString(){
        return this.speed+" "+this.gear+" ";
    }


}

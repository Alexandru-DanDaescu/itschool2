package session10_inheritanceAndEncapsulation.challenges.differenttypesofinheritance.hierarchicalinheritance;

public class Boat {

    private double length;
    private double width;
    private double weight;
    private String model;

    public Boat(double length, double width, double weight, String model){
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.model = model;
    }

    public void sail(){
        System.out.println("We're going to the bermuda triangle");
    }

    public void hoistSail(){
        if(checkSpeed() == 0) {
            System.out.println("The sail has been hoisted and we stopped moving.");
        }
    }

    private int checkSpeed(){
        return 0;
    }


    public String toString() {
        return  length + " " + width + " " + weight + " " + model + " ";
    }
}

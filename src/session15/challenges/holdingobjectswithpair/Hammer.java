package session15.challenges.holdingobjectswithpair;

public class Hammer {

    private String model;
    private int stock;

    public Hammer(String model, int stock){
        this.model = model;
        this.stock = stock;
    }

    public String toString(){
        return this.model + " " + this.stock + " ";
    }

}

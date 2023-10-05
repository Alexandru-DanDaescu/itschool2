package session10_inheritanceAndEncapsulation.challenges.differenttypesofinheritance.multilevelinheritance;

import java.time.LocalDate;

public class Car {


    private String make;
    private String model;
    private LocalDate year;
    public Car(String make, String model,LocalDate year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The engine is starting");
    }

    public void stop(){
        System.out.println("The engine has stopped");
    }

    public int accelerate(){
        return 1;
    }

    public String toString(){
        return this.make+" "+this.model+" "+this.year+" ";
    }

}

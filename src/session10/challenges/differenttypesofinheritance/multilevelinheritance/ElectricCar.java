package session10.challenges.differenttypesofinheritance.multilevelinheritance;

import java.time.LocalDate;

public class ElectricCar extends Car{


   private int batteryCapacity;
   private int range;

    public ElectricCar(String make, String model, LocalDate year,int batteryCapacity, int range){
        super(make,model,year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public int charge(int battery){
        return battery += 3;
    }
    @Override
    public String toString(){
        return super.toString()+this.batteryCapacity+" "+this.range+" ";
    }

}

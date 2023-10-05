package session9_oopConcepts.practice;

public class Car {

    String brand;

    String model;

    int speed;

    void accelerate(){
        speed += 10;
    }

    void decelerate(){
        speed -= 10;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getSpeed() {
        return speed;
    }



    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

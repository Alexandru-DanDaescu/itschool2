package session12.practice.objectversusreference;

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //Car anotherCar = car; //not good
        //explicit casting
        Car anotherCar = (Car) car;

    }
}

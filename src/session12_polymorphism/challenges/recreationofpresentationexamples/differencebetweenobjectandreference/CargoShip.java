package session12_polymorphism.challenges.recreationofpresentationexamples.differencebetweenobjectandreference;

public class CargoShip extends Ship implements HasEquipment{

    public boolean hasEquipment(){
        return false;
    }

    @Override
    public String modelType(){
        return "Cargo ship";
    }

}

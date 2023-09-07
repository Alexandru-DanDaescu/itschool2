package session12.challenges.recreationofpresentationexamples.differencebetweenobjectandreference;

public class FishingShip extends Ship implements HasEquipment{

    public boolean hasEquipment(){
        return true;
    }

    @Override
    public String modelType(){
        return "Fishing ship";
    }

}

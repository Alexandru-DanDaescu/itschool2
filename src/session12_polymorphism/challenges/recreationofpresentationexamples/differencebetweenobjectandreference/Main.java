package session12_polymorphism.challenges.recreationofpresentationexamples.differencebetweenobjectandreference;

public class Main {

    public static void main(String[] args) {

        Ship fishingShip = new FishingShip();
        Ship cargoShip = new CargoShip();

        System.out.println(fishingShip.modelType()+ " " + ((FishingShip) fishingShip).hasEquipment());
        System.out.println(cargoShip.modelType()+ " " + ((CargoShip) cargoShip).hasEquipment());


        FishingShip anotherShip = (FishingShip) fishingShip;

        System.out.println(new StringBuilder()
                .append("\n")
                .append(anotherShip.modelType()).append(" ")
                .append(anotherShip.hasEquipment()));


    }

}

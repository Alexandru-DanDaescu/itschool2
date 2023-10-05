package session15_equalsAndHashcodeAndGenerics.challenges.cartypes;

public enum CarTypes {

    OPEL_ASTRA(34534.34,"Opel"),
    BMW(45000.34,"BMW"),
    TESLA(56743.12,"Tesla");

    private double price;
    private String manufacturer;

    CarTypes(double price,String manufacturer){
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        switch (this){
            case OPEL_ASTRA -> stringBuilder.append("Opel Astra");
            case BMW -> stringBuilder.append("BMW");
            case TESLA -> stringBuilder.append("Tesla");
        }
        stringBuilder.append(" Car price is: ").append(getPrice());
        stringBuilder.append(" Manufacturer: ").append(getManufacturer());
        return stringBuilder.toString();
    }

}

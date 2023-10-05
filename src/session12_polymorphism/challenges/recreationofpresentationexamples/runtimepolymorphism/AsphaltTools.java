package session12_polymorphism.challenges.recreationofpresentationexamples.runtimepolymorphism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AsphaltTools {


    private String name;
    private String model;
    private String date;
    private LocalDate year;

    public AsphaltTools(String name, String model, String date){
        this.name = name;
        this.model = model;
        this.date = date;
        this.year = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    @Override
    public String toString(){
        return this.name + " " + this.model + " " + this.date;
    }

}

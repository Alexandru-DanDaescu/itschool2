package session15_equalsAndHashcodeAndGenerics.challenges.returnjsonofobject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tank {

    private String model;

    private LocalDate year;

    private String dateInput;

    private int amount;

    public Tank(String model, String dateInput, int amount){
        this.model = model;
        this.year = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.amount = amount;
    }


}

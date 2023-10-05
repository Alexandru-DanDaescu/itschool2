package session13_recapAndSolid.challenges.librarymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Author {


    private String nationality;

    private String authorName;

    private LocalDate dateOfBirth;


    public Author(String nationality, String authorName, String dateInput) {
        this.nationality = nationality;
        this.authorName = authorName;
        this.dateOfBirth = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }


    public String toString() {
        return this.nationality + " " + this.authorName + " " + this.dateOfBirth + " ";
    }


}

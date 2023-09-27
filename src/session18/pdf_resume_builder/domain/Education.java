package session18.pdf_resume_builder.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Education {

    private String university;
    private String degree;
    private LocalDate date;
    private String dateInput;

    public Education(String university, String degree, String dateInput) {
        this.university = university;
        this.degree = degree;
        this.date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }
}

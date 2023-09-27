package session18.pdf_resume_builder.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkExperience {

    private String companyName;
    private String jobTitle;
    private String jobDescription;
    private LocalDate duration;
    private String durationInput;

    public WorkExperience(String companyName, String jobTitle, String jobDescription, String durationInput) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.duration = LocalDate.parse(durationInput, DateTimeFormatter.ofPattern("yyyy-MMM-dd"));
    }
}

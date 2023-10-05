package session18_recapAgain.pdf_resume_builder.domain;

import java.util.ArrayList;
import java.util.List;

public class Resume {

    private PersonalInformation personalInformation;
    private String objective;
    private List<Education> educationList;
    private List<WorkExperience> workExperienceList;

    public Resume(PersonalInformation personalInformation,String objective){
        this.personalInformation = personalInformation;
        this.objective = objective;
        this.educationList = new ArrayList<>();
        this.workExperienceList = new ArrayList<>();
    }

}

package session9_oopConcepts.challenges.collegemanagementsystem;

public class Courses {

    private final String lessons;

    private final String schedule;

    private final String duration;

    private final String description;

    public Courses(String lessons, String schedule, String duration, String description){
        this.lessons = lessons;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public String getLessons(){
        return lessons;
    }

    public String getSchedule(){
        return schedule;
    }

    public String getDuration(){
        return duration;
    }

    public String getDescription(){
        return description;
    }

    public void courseAssignments(Professors professors, Students students){
        System.out.println("Professor "+professors.getFirstName()+" "+professors.getLastName()+" will hold a lesson about "+this.getLessons()+"."+
                "\nThe student "+students.getFirstName()+" "+students.getLastName()+" will participate in this lesson.");
        System.out.println("The lesson will be about "+this.getDescription());
        System.out.println("The lesson is scheduled for "+this.getSchedule()+"."+"\nThe duration of the lesson is "+this.getDuration()+".");
    }


}

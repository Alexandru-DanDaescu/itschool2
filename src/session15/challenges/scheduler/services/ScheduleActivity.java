package session15.challenges.scheduler.services;

import session15.challenges.scheduler.domain.Activities;
import session15.challenges.scheduler.domain.Day;

public class ScheduleActivity {


    private Day day;

    private Activities activities;

    public ScheduleActivity(Activities activities){
        this.activities = activities;
        setSchedule(activities);
    }


    private void setSchedule(Activities activities){
        if(activities.getActivityForCurrentDay().contains("Work1")){
            day = Day.MONDAY;
            System.out.println("Working");
        }
        else if (activities.getActivityForCurrentDay().contains("Jogging")) {
            day = Day.TUESDAY;
            System.out.println("Jogging with dogs.");
        }
        else if (activities.getActivityForCurrentDay().contains("Work2")) {
            day = Day.WEDNESDAY;
            System.out.println("Going back to work.");
        }
        else if (activities.getActivityForCurrentDay().contains("Convention")) {
            day = Day.THURSDAY;
            System.out.println("Going to a it convention");
        }
        else if (activities.getActivityForCurrentDay().contains("Meeting")) {
            day = Day.FRIDAY;
            System.out.println("Meeting with team lead.");
        }
        else if(activities.getActivityForCurrentDay().contains("Break1")){
            day = Day.SATURDAY;
            System.out.println("Playing some video games.");
        }
        else if(activities.getActivityForCurrentDay().contains("Break2")){
            day = Day.SUNDAY;
            System.out.println("Time to play with cat.");
        }


    }





}

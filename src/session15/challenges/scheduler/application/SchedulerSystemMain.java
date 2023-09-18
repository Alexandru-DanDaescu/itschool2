package session15.challenges.scheduler.application;

import session15.challenges.scheduler.domain.Activities;
import session15.challenges.scheduler.services.ScheduleActivity;

public class SchedulerSystemMain {

    public static void main(String[] args) {

        Activities activities1 = new Activities("Jogging", "12:23:10");

        ScheduleActivity scheduleActivity = new ScheduleActivity(activities1);



    }
}

package session15_equalsAndHashcodeAndGenerics.challenges.scheduler.domain;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Activities {


    private String activityForCurrentDay;

    private LocalTime hour;

    public Activities(String activityForCurrentDay,String hourInput){
        this.activityForCurrentDay = activityForCurrentDay;
        this.hour = LocalTime.parse(hourInput, DateTimeFormatter.ofPattern("HH:mm:ss"));
    }


    public String getActivityForCurrentDay() {
        return activityForCurrentDay;
    }

    public void setActivityForCurrentDay(String activityForCurrentDay) {
        this.activityForCurrentDay = activityForCurrentDay;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    @Override
    public String toString(){
        return activityForCurrentDay + " " + hour;
    }
}

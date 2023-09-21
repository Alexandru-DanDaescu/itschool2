package session15.practice.enums;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true);


    private boolean isWeekday;

    Day(boolean isWeekday){
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday(){
        return isWeekday;
    }


}
package session15.challenges.trafficlight;

public enum LightColor {

    RED("red = Stop",30),
    YELLOW("yellow = Caution",5),
    GREEN("green = Go",45);

    private String color;

    private int seconds;

    LightColor(String color,int seconds){
        this.color = color;
        this.seconds = seconds;
    }

    public String getColor(){
        return color;
    }

    public int getSeconds(){
        return seconds;
    }

}

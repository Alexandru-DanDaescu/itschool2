package session15.challenges.trafficlight;

public class Main {

    public static void main(String[] args) {


        setTrafficLightColor(LightColor.RED);
        setTrafficLightColor(LightColor.YELLOW);
        setTrafficLightColor(LightColor.GREEN);

    }

    private static void setTrafficLightColor(LightColor lightColor){
        switch (lightColor){
            case RED :
                System.out.println("The traffic light is " + lightColor.getColor() + ". Wait " + lightColor.getSeconds() +" seconds.");
                break;
            case YELLOW:
                System.out.println("The traffic light is " + lightColor.getColor() + ". Hurry, you have " + lightColor.getSeconds() +" seconds.");
                break;
            case GREEN :
                System.out.println("The traffic light is " + lightColor.getColor() + ". You have " + lightColor.getSeconds() +" seconds to pass the zebra.");
                break;
            default:
                System.out.println("Invalid color.");
        }
    }
}

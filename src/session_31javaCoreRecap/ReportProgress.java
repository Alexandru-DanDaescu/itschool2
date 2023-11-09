package session_31javaCoreRecap;

public class ReportProgress {

    public static void main(String[] args) {
        String task = "Download";
        int currentStep = 4;
        int totalSteps = 10;



        System.out.println(String.format("%s progress: [Step %02d / %02d]", task, currentStep, totalSteps));
    }
}

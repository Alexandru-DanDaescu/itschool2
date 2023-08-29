package session10.practice.hospitalmanagementsystem;

public class HospitalManageMentSystem {

    public static void main(String[] args) {

        Patient patientOne = new Patient("John",60);
        Patient patientTwo = new Patient("Luap",15);
        Patient patientThree = new Patient("Alice",27);



        Doctor doctorOne = new Doctor("Ciomu","Urology");
        Doctor doctorTwo = new Doctor("Stone","Opthalmology");
        Doctor doctorThree = new Doctor("Jones","Surgery");

        Hospital arcadia = new Hospital();
        Hospital judetean = new Hospital();
        Hospital reginaMaria = new Hospital();

        arcadia.admitPatientToList(patientOne);
        judetean.admitPatientToList(patientTwo);
        reginaMaria.admitPatientToList(patientThree);

        for(Patient patient : arcadia.getPatients()){
            System.out.println("Patient: "+patient.getName());
        }

        
    }


}

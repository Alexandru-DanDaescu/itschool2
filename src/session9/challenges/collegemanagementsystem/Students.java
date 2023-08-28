package session9.challenges.collegemanagementsystem;

public class Students extends Professors{

    public Students(String firstName, String lastName, char sex, int age, String dateOfBirth, int id, String address) {
        super(firstName,lastName,sex,age,dateOfBirth,id,address);
    }


    @Override
    public String toString(){
        return super.toString();
    }




}

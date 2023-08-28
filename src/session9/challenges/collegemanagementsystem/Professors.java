package session9.challenges.collegemanagementsystem;

public class Professors {

    private final String firstName;

    private final String lastName;

    private final char sex;

    private final int age;

    private final String dateOfBirth;

    private final int id;

    private final String address;

    public Professors(String firstName, String lastName, char sex, int age, String dateOfBirth, int id, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getSex() + " " +
                this.getAge() + " " + this.getDateOfBirth() + " " + this.getId() + " " + this.getAddress();

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }


    public String getAddress() {
        return address;
    }

}

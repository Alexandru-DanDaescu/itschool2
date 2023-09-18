package session15.challenges.studentequalshashcode;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("John");
        student1.setAge(22);
        student1.setEmail("email");


        Student student2 = new Student();
        student2.setName("John");
        student2.setAge(22);
        student2.setEmail("email");

        System.out.println(student1.equals(student2));

        System.out.println("Student1: " + student1.hashCode());
        System.out.println("Student2: " + student2.hashCode());


    }
}

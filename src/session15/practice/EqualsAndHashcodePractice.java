package session15.practice;

import java.util.Set;
import java.util.HashSet;

public class EqualsAndHashcodePractice {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Alice");
        emp1.setDepartment("IT");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Alice");
        emp2.setDepartment("IT");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);

        System.out.println("Set size: " + employeeSet.size());
        System.out.println("Emp1 hashCode: " + emp1.hashCode());
        System.out.println("Emp2 hashCode: " + emp2.hashCode());


        System.out.println("Emp1: " + emp1);
        System.out.println("Emp2: " + emp2);


    }
}

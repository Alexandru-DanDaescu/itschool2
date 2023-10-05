package session17_streamAndOptional.challenges.largestsalary;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Jackson","Dep1",2334.34),
                new Employee("Danny","Dep2",6545.34), new Employee("Francis","Dep3",4564.23),
                new Employee("Frank","Dep4",7897.21));


        Map<String, Double> totalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));

        Optional<Map.Entry<String,Double>> maxSalary = totalSalary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Department " + maxSalary.get().getKey() + " salary " + maxSalary.get().getValue());




    }


}

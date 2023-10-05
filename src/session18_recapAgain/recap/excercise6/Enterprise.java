package session18_recapAgain.recap.excercise6;

public class Enterprise {

    public static void main(String[] args) {

        Employee john = new Employee("John", "Vertical", 1200);
        EmployeeService employeeService = new EmployeeService(john);

        employeeService.printYearlyEarnings();

        employeeService.giveRaise(-200);
        employeeService.deductTaxes(1);
        employeeService.printYearlyEarnings();


    }
}

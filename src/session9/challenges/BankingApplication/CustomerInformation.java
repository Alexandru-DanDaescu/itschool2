package session9.challenges.BankingApplication;

import java.util.Scanner;

public class CustomerInformation {



    private String name;
    private String address;
    private char sex;
    private int age;
    private double initialDeposit;



    public CustomerInformation(){
        System.out.println("Enter the personal data of the customer.(name,address,sex,age and initial deposit)");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.next();
        this.address = scanner.next();
        this.sex = scanner.next().charAt(0);
        this.age = scanner.nextInt();
        this.initialDeposit = scanner.nextDouble();
    }


    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public char getSex(){
        return sex;
    }

    public int getAge(){
        return age;
    }

    public double getInitialDeposit(){
        return initialDeposit;
    }


}

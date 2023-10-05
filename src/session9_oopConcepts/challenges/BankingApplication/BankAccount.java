package session9_oopConcepts.challenges.BankingApplication;

import java.util.Scanner;

public class BankAccount {

    private double depositedMoney;

    public double deposit(CustomerInformation customerInformation){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you wish to add to your account");
        depositedMoney = scanner.nextDouble();
        depositedMoney += customerInformation.getInitialDeposit();
        return depositedMoney;
    }

    public double withdraw(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you wish to withdraw from your account"+
                "\nThe current amount that is in the account: "+depositedMoney);
        double withdrawnMoney = scanner.nextDouble();
        depositedMoney -= withdrawnMoney;
        return depositedMoney;
    }

    public void checkBalance(CustomerInformation customerInformation){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The initial amount in the account is: ")
                .append(customerInformation.getInitialDeposit())
                .append(" The amount that is in the account after withdrawing is: ")
                .append(depositedMoney);
        System.out.println(stringBuilder);
    }

    public void printCustomerInformation(CustomerInformation customerInformation){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The private information of the customer is: ")
                .append(customerInformation.getName())
                .append(" ")
                .append(customerInformation.getAddress())
                .append(" ")
                .append(customerInformation.getSex())
                .append(" ")
                .append(customerInformation.getAge());
        System.out.println(stringBuilder);
    }

}

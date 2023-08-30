package session10.challenges.bankaccountmanagementsystem;

import java.util.Scanner;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class BankAccount {


    private String accountHolderName;

    private double accountBalance;

    private UUID accountNumber;

    private double currentMoney;

    private List<Client> clients;

    public BankAccount(String accountHolderName, double accountBalance){
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = UUID.randomUUID();
        this.clients = new ArrayList<>();
    }


    public List<Client> getClients(){
        return clients;
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public double depositSum(Client client){
         currentMoney = 0;
        if(client.getCurrentBalance() > 0 && this.accountBalance + client.getCurrentBalance() > 0){
           currentMoney = this.accountBalance + client.getCurrentBalance();
        }
        else {
            System.out.println("The amount of money in the account is negative");
        }
        return currentMoney;
    }

    public double withdrawSum(Client client){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you wish to withdraw");
        double withdrawSpecifiedSum = scanner.nextDouble();
        if( currentMoney - withdrawSpecifiedSum > 0 && client.getCurrentBalance() > 0){
            currentMoney -= withdrawSpecifiedSum ;
        }
        else {
            System.out.println("ERROR : Could not withdraw specified amount");
        }
        scanner.close();
        return currentMoney;
    }






    public String toString(Client client) {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", sum=" + currentMoney +
                ", clients=" + client.toString() +
                '}';
    }
}

package session9.challenges.BankingApplication;

public class Main {

    public static void main(String[] args) {


//  3. Simple Banking Application - Construct a banking system that lets account holders:
//  Create an account with personal details and an initial deposit.
//  Deposit and withdraw money from their account.
//  Check their current balance.
//  View a summary of their recent transactions, including deposits, withdrawals, and balance after each transaction.




        BankAccount bankAccount = new BankAccount();
        CustomerInformation customerInformationOne = new CustomerInformation();

       bankAccount.deposit(customerInformationOne);

       bankAccount.withdraw();

       bankAccount.checkBalance(customerInformationOne);

       bankAccount.printCustomerInformation(customerInformationOne);



    }
}

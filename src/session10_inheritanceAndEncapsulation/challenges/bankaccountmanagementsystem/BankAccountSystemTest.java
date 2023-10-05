package session10_inheritanceAndEncapsulation.challenges.bankaccountmanagementsystem;

public class BankAccountSystemTest {

    public static void main(String[] args) {

        Client clientOne = new Client(1232.234, 'F', "2000-12-03");

        BankAccount bankAccount = new BankAccount("Maria", 500);

        bankAccount.addClient(clientOne); //Client is added to the bank account.

        bankAccount.depositSum(clientOne); //The current money from the client is added to the client's bank account.

        bankAccount.withdrawSum(clientOne); //A specific amount of money is withdrawn.

        System.out.println(bankAccount.toString(clientOne));  //Details of the account.


    }

}

package session11.challenges.challengetwo;

public class BankB extends Bank{

    private String accountHolderName;
    private double money;

    public BankB(String accountHolderName, double money){
        this.accountHolderName = accountHolderName;
        this.money = money;
    }

    public double getBalance(){
        return money;
    }

    public String getAccountHolderName(){
        return  accountHolderName;
    }
}

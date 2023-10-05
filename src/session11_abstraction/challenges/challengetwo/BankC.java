package session11_abstraction.challenges.challengetwo;

public class BankC extends Bank{
    private String accountHolderName;
    private double money;

    public BankC(String accountHolderName, double money){
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

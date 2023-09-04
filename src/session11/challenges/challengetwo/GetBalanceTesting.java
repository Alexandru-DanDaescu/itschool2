package session11.challenges.challengetwo;

public class GetBalanceTesting {

    public static void main(String[] args) {
        BankA bankA = new BankA("Daniel",200.23);
        BankB bankB = new BankB("John",400.23);
        BankC bankC = new BankC("Rambo",32234.234423);

        System.out.println(bankA.getAccountHolderName()+" "+bankA.getBalance());
        System.out.println(bankB.getAccountHolderName()+" "+bankB.getBalance());
        System.out.println(bankC.getAccountHolderName()+" "+bankC.getBalance());


    }
}

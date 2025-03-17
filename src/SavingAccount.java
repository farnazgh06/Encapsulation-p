public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber,String accountHolderNumber ,double initialBalance){

    }

    @Override
    public void calculateInterest() {
        deposit(balance * interestRate);
        System.out.println("deposit " + balance * interestRate + "$" + "SavingAccount");

    }
}

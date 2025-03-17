public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount (String accountHolderNumber, String accountNumber ,double initialBalance){
            super(accountNumber, accountHolderNumber,initialBalance);
    }

    @Override
    public void calculateInterest() {
        deposit(balance * interestRate);
        System.out.println("deposit " + balance * interestRate + "$" + "SavingAccount");

    }
}

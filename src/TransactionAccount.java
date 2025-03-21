public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500.00;

    public TransactionAccount (String accountNumber , String accountHolderName , double initialBalance){
        super(accountHolderName, accountNumber, initialBalance);

    }

    @Override
    public void calculateInterest() {
        System.out.println("there is no interest");
    }

    @Override
    public void withDraw(double amount) {
        if (amount <= 500 && amount >= 0 && amount <= (balance + overDraftLimit)){
            balance -= amount;
            System.out.println("withDraw " + amount + "$");
        }
        else {
            System.out.println("amount is incorrect.");
        }

    }
}

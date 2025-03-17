public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public abstract void calculateInterest() {
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("deposit " + amount + "$");
        } else {
            System.out.println("amount is incorrect.");
        }
    }

    public void withDraw(double amount) {
        if (amount >= 0) {
            balance -= amount;
            System.out.println("Withdraw " + amount + "$");
        } else {
            System.out.println("amount is incorrect.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

}


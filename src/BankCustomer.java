import java.util.ArrayList;

public class BankCustomer {
    private ArrayList<BankAccount> accountList;

    public void addAccount(BankAccount account){
        this.accountList = new ArrayList<>();
        accountList.add(account);
    }

    public void showAllBalances(){
        for (BankAccount account : accountList){
            System.out.println("Name : " + account.getAccountHolderName());
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Balance : " + account.getBalance());
        }
    }
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
                System.out.println("Name : " + account.getAccountHolderName());
                System.out.println("Account Number : " + account.getAccountNumber());
                System.out.println("Balance : " + account.getBalance());
            }
        }
        return null;
        System.out.println("there is no account");

    }
}

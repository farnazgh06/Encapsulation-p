import java.util.ArrayList;

public class BankCustomer {
    private ArrayList<BankAccount> accountList = new ArrayList<>();

    public void addAccount(BankAccount account){
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
                System.out.println("Name : " + account.getAccountHolderName());
                System.out.println("Account Number : " + account.getAccountNumber());
                System.out.println("Balance : " + account.getBalance());
                return account;
            }
        }

        System.out.println("there is no account");
        return null;

    }
}

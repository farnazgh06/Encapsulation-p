public class Main {
    public static void main(String[] args) {

        BankCustomer bank = new BankCustomer();

        TransactionAccount person1 = new TransactionAccount("person1", "6037", 3500.0);
        TransactionAccount person2 = new TransactionAccount("person2", "5022", 4500.0);
        TransactionAccount person3 = new TransactionAccount("person3", "6219", 5500.0);

        bank.addAccount(person1);
        bank.addAccount(person2);
        bank.addAccount(person3);

        SavingAccount fard1 = new SavingAccount("fard1", "6104", 1700.0);
        SavingAccount fard2 = new SavingAccount("fard2", "5859", 2700.0);
        SavingAccount fard3 = new SavingAccount("fard3", "6037", 3700.0);

        bank.addAccount(fard1);
        bank.addAccount(fard2);
        bank.addAccount(fard3);

        // جست و جوی یک حساب موجود و ناموجود

        BankAccount findAccount1 = bank.findAccount("6037");
        BankAccount findAccount2 = bank.findAccount("1234");

        if(findAccount1 != null){
            System.out.println(findAccount1.getBalance());
            person1.deposit(1500.0);
            System.out.println(findAccount1.getBalance());
        }

        // مبلغ نادرست به حساب دیگر
        person2.deposit(-150);

        //حساب سود برای حساب پس اندازی
        person3.calculateInterest();
        System.out.println(" موجودی جدید " + person3.getBalance());

        //حساب سود برای حساب جاری
        fard3.calculateInterest();
        System.out.println("موجودی جدید " + fard3.getBalance());

        //برداشت از هر دو نوع حساب با مبلغ های مختلف
        person2.withDraw(50);
        person2.withDraw(-50);
        person2.withDraw(550);

        fard1.withDraw(60);
        fard1.withDraw(-60);
        fard1.withDraw(600);

        System.out.println(" * موجودی ها * ");
        bank.showAllBalances();
    }

}
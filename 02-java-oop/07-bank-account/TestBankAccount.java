public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount();
        BankAccount secondAcct = new BankAccount();
        myAcct.deposit(200.25, "checking");
        System.out.println(myAcct.getCheckingBalance());
        System.out.println(BankAccount.totalAccounts());
        myAcct.withdrawal(100.00, "checking");
        System.out.println(BankAccount.bankBalance());
        secondAcct.withdrawal(100.00, "checking");
        secondAcct.deposit(175.00, "savings");
        System.out.println(BankAccount.totalAccounts());
        System.out.println(BankAccount.bankBalance());
    }
}

public class BankAccount {
    private Double checkingBalance = 0.00;
    private Double savingsBalance = 0.00;

    private static Integer numOfAccounts = 0;
    private static Double totalBankBalance = 0.00;

    public BankAccount(){
        numOfAccounts++;
    }

    public static int totalAccounts(){
        return numOfAccounts;
    }

    public static Double bankBalance(){
        return totalBankBalance;
    }

    public Double getCheckingBalance(){
        return this.checkingBalance;
    }

    public Double getSavingsBalance() {
        return savingsBalance;
    }
    
    public Double getTotalBalance() {
        return savingsBalance + checkingBalance;
    }

    public void deposit(Double amount, String account){
        if(account == "checking"){
            this.checkingBalance += amount;
            totalBankBalance += amount;
            System.out.println("$" + amount + " deposited to " + account +"");
        }else if (account == "savings"){
            this.savingsBalance += amount;
            totalBankBalance += amount;
            System.out.println("$" + amount + " deposited to " + account +"");
        }else{
            System.out.println("Incorrect account name");
        }
    }

    public void withdrawal(Double amount, String account){
        if(account == "checking" && this.checkingBalance >= amount){
            this.checkingBalance -= amount;
            totalBankBalance -= amount;
            System.out.println("$" + amount + " withdrawn from " + account +"");
        }else if (account == "savings" && this.savingsBalance >= amount){
            this.savingsBalance -= amount;
            totalBankBalance -= amount;
            System.out.println("$" + amount + " withdrawn from " + account +"");
        }else{
            System.out.println("Incorrect account name or not enough funds");
        }
    }
    

}

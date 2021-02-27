import java.util.Random;

class BankAccount {

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double accountBalance = 0;
    private static String id() {
        Random random = new Random();
        String acct = "";
        for (int i = 0; i < 10; i++) {
            acct += random.nextInt(10);
        }
        return acct;
    }
    public BankAccount() {
        this.accountNumber = BankAccount.id();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts += 1;
        accountBalance += (checkingBalance + savingsBalance); 
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void accountDeposit(double amount, String account) {
        if (account.equals("savings")) {
            this.savingsBalance += amount;
        } else if(account.equals("checking")) {
            this.checkingBalance += amount;
        }
    }

    public void accountWithdrawal(double amount, String account) {
        if (account.equals("savings")) {
            if (amount <= this.savingsBalance) {
                this.savingsBalance -= amount;
            } else {
                System.out.println("Withdrawal is too big");
            }
        } else if (account.equals("checking")) {
            if (amount <= this.checkingBalance) {
                this.checkingBalance -= amount;
            } else {
                System.out.println("Withdrawal is too big");
            }
        }
    }

    public void getBalance() {
        System.out.println("Checking: " + this.checkingBalance + " , Savings:" + this.savingsBalance);
    }
}
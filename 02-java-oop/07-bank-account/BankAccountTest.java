class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountDeposit(500.00, "checking");
        account.accountDeposit(600.00, "savings");
        account.accountWithdrawal(300.00, "checking");
        account.accountWithdrawal(100.00, "savings");
        account.getBalance();
        account.getBalance();
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John Doe", 1000.0);

        bankAccount.withdraw(500.0);
        bankAccount.deposit(5000.0);
        bankAccount.withdraw(2000.0);

        System.out.println("Account Holder: " + bankAccount.getOwner());
        System.out.println("Current Balance: $" + bankAccount.getBalance());
    }
}

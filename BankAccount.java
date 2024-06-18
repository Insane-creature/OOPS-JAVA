// Encapsulation
public class BankAccount {

    private String accountNumber;
    private double balance;

    // Constructor to init. the bank acc
    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    //Method to get acc number
    public String getAccNumber(){
        return accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account Number: " + account.getAccNumber());
        System.out.println("Balance: " + account.getBalance());
    }

}

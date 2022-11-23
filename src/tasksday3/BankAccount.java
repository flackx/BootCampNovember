package tasksday3;

public class BankAccount {
    private String firstName;
    private int balance;

    public BankAccount(String firstName, int balance) {
        this.firstName = firstName;
        this.balance = balance;
    }

    public String getName() {
        return firstName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 5000) {
            balance += amount;
        }else{
            System.out.println("You can't deposit more than 5000");
        }
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void transfer(BankAccount other, int amount) {
        if (amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Insufficient funds."+" amount: "+amount+" balance: "+balance);
        }
    }

    public String toString() {
        return "Name: " + firstName + ", Balance: " + balance;
    }
}

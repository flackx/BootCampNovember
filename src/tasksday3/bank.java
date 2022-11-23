package tasksday3;

public class bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Adam", 1000);
        BankAccount account2 = new BankAccount("John", 1000);
        account1.deposit(5000);
        account1.deposit(6000);
        account1.withdraw(500);
        account1.transfer(account2, 500);
        account2.withdraw(10000);
        System.out.println(account1);
        System.out.println(account2);
    }
}

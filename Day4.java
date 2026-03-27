class Bank {
    String name;
    int Balance;

    Bank(String n, int b) { 
        name = n;
        Balance = b;
    }

    void display() {
        System.out.println("Account holder: " + name);
        System.out.println("Balance: " + Balance);
    }
}
class Transaction extends Bank {

    Transaction(String n, int b) {
        super(n, b);
    }

    void deposit(int amount) {
        Balance = Balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= Balance) {
            Balance = Balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class Day4 {
    public static void main(String[] args) {

        Transaction obj = new Transaction("Joy", 3000);

        obj.display();
        obj.deposit(500);
        obj.withdraw(300);
        obj.display();
    }
}
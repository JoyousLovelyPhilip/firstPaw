import java.util.Scanner;
class Account{
    String name;
    double balance;

    Account(String name, double balance){
        this.name= name;
        this.balance= balance;
    }
     void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Updated Balance = "+ balance);
        
        }
        else{
            System.out.println("Invalid Amount");
        }
     }

     void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient Balance !");
        }
        else if (amount <= 0){
            System.out.println("Invalid amount!");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance = " +balance);
        }
     }
     void checkBalance(){
        System.out.println("Current Balance = " +balance);
     }
     
}
public class ConstructorBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        Account acc = new Account(name, balance);

        int choice;

        do {
            System.out.println("\n Bank Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    acc.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    acc.withdraw(withdraw);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you, " + acc.name + "! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
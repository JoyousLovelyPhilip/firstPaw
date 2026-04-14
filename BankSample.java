import java.util.Scanner;
public class BankSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\nBANK MENU ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully!");
                        System.out.println("Updated Balance = " + balance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining Balance = " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Thank you, " + name + "!, I LOVE YOU, Visit again. MUA");
                    break;

                default:
                    System.out.println("Invalid choice ");
            }

        } 
        while (choice != 4);
        sc.close();
    }
}
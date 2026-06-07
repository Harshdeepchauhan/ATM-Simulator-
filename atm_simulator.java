package internship_Kodbud;

import java.util.Scanner;

public class atm_simulator {

    static int balance = 2000;

    //method for balancecheck
    static int balance() {
        System.out.println("Your balance is: $" + balance);
        return 0;
    }

    //method for deposit
    static double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: $" + balance);
        } else {
            System.out.println("Invalid amount");
        }
        return amount;
    }

    //Method for withdrawl
    static double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn");
            System.out.println("Current balance: $" + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
        return amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("\n-----ATM SIMULATOR-----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance();
                    break;

                    case 2:
                        System.out.println("Enter the amount you want to deposit: ");
                        double amount = sc.nextDouble();
                        deposit(amount);
                        break;

                        case 3:
                        System.out.println("Enter the amount you want to withdraw: ");
                        double amount2 = sc.nextDouble();
                        withdraw(amount2);
                        break;

                        case 4:
                            System.out.println("Thank you for using atm simulator");
                            break;

                            default:
                                System.out.println("Invalid choice, Please try again");
            }
        }
        while(choice!=4);
        sc.close();

    }
}
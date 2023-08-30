import java.util.Scanner;

public class ATMinterface {
    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }
    }

    public static class ATMMachine {
        private BankAccount bankAccount;
        private Scanner scanner;

        public ATMMachine(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
            this.scanner = new Scanner(System.in);
        }

        public void displayOptions() {
            System.out.println("Select an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
        }

        public void run() {
            boolean exit = false;

            while (!exit) {
                displayOptions();
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        if (bankAccount.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient balance for withdrawal...");
                        }
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        bankAccount.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                        break;

                    case 3:
                        System.out.println("Account balance: " + bankAccount.getBalance());
                        break;

                    case 4:
                        exit = true;
                        System.out.println("Exiting...");
                        System.out.println("you are exited");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance
        ATMMachine atm = new ATMMachine(userAccount);
        System.out.println("Welcome..!!!");
        atm.run();
    }
}
import java.util.Scanner;

class Bank {
    String customername;
    int accnum;
    String acctype;
    double balance;
    Scanner sc = new Scanner(System.in);

    void takeDetails() {
        System.out.print("Enter name: ");
        customername = sc.next();
        System.out.print("Enter acc num: ");
        accnum = sc.nextInt();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter the amount to be deposited: ");
        double depamt = sc.nextDouble();
        balance = depamt + balance;
        System.out.println("Updated balance after depositing: " + balance);
    }

    void withdraw() {
        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough balance!");
        }
        System.out.println("Balance after withdraw: " + balance);
    }

    void calculateInterest() {
        System.out.println("Interest not applicable for this account.");
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavAcc extends Bank {
    double interestRate;

    void setInterest() {
        System.out.print("Enter Interest rate: ");
        interestRate = sc.nextDouble();
    }
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Balance after interest: " + balance);
    }
}

class CurAcc extends Bank {
    void withdraw() {
        double minBalance = 500;
        double penalty = 50;
        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            if (balance < minBalance) {
                balance -= penalty;
                System.out.println("Penalty charged! New balance: " + balance);
            }
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

public class BankSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Bank acc;

        System.out.print("Enter Account Type (Savings/Current): ");
        String typ = sc.next();

        if (typ.equalsIgnoreCase("Savings")) {
            acc = new SavAcc();
            ((SavAcc) acc).setInterest();
        } else {
            acc = new CurAcc();
        }

        acc.takeDetails();

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Calculate Interest\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                {
                    acc.deposit();
                }
                case 2:
                {
                    acc.withdraw();
                }
                case 3:
                {
                    acc.displayBalance();
                }
                case 4:
                {
                    acc.calculateInterest();
                }
                case 5:
                {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}

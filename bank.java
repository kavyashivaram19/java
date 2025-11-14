import java.util.Scanner;
public class Bank 
{
    String customername;
    int accnum;
    String acctype;
    double balance;
    Scanner sc=new Scanner(System.in);
    public void takeDetails()
    {
        System.out.println("enter name:");
        customername=sc.next();
        System.out.println("enter acc num:");
        accnum=sc.nextInt();
        System.out.println("enter initial bal:");
        balance=sc.nextDouble();
    }

    public void deposit(){
        double depamt;
        System.out.println("enter the amount to be deposited:");
        depamt=sc.nextInt();
        balance=depamt+balance;
        System.out.println("Updated balance after depositing:"+balance);

    }
    public void withdraw() 
    {
        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough balance!");
        }
        System.out.println("Balance after withdraw: " + balance);
    }
    public void calculateInterest(){
        System.out.println("not applicable");
    }

    public void displaybalance()
    {
        System.out.println("balance:"+balance);
    }
    
}
public class SavAcc extends Bank
{
    double interestRate;
    Scanner sc=new Scanner(System.in);
    public void setinterest(){
        System.out.println("enter Interest rate:");
        interestRate=sc.nextDouble();

    }
    
    public void calculateInterest() 
    {
        double interest = balance * Math.pow(1 + (interestRate / 100), 1) - balance;
        balance += interest;
        System.out.printf("balance after adding interest:"+balance);
    }

}

public class CurAcc extends Bank
{
    public void withdraw() 
    {
        double minBalance = 500;
        double penalty = 50;

        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt <= balance) 
        {
            balance -= amt;
            if (balance < minBalance) 
            {
                balance -= penalty;
                System.out.println("Penalty charged! New balance: " + balance);
            }
        } 
        else 
        {
            System.out.println("Not enough balance!");
        }
    }
}

   
public class BankSystem
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        bank acc;
        String typ;

        System.out.println("Enter Account Type (Savings/Current): ");
        typ= sc.next();

        if (typ.equalsIgnoreCase("Savings"))
            acc = new SavAcc();
        else
            acc = new CurAcc();

        acc.takeDetails();

        int choice;
        while(true)
        {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Calculate Interest\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:{
                    acc.deposit();
                    break;
                } 
                case 2:
                {
                    acc.withdraw();
                    break;} 
                case 3:{
                    acc.displaybalance();
                    break;
                }
                case 4:
                {
                    acc.calculateInterest();
                    break;
                }
                case 5:
                    System.exit(0);
                    break;
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}


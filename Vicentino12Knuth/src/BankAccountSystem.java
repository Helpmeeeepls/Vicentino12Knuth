import java.util.Scanner;

class BankAccountSystem {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccountSystem(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing " + amount + "... New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawing " + amount + "... New Balance: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccountSystem myAccount = new BankAccountSystem("John Doe", 123456, 5000.0);
        myAccount.displayBalance();

        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        myAccount.displayBalance();
    }
}

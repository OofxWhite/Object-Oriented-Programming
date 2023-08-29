import java.util.Scanner;

class BANK_ACCOUNT {
    String name;
    int account_number;
    String account_type;
    int balance;
    static int min_balance = 500;
    static double interest_rate = 7.1;

    
    BANK_ACCOUNT() {
        System.out.println("Inside zero argument constructor");
    }

    BANK_ACCOUNT(String n, int an, String at, int b) {
        System.out.println("Inside parameterized constructor");
        name = n;
        account_number = an;
        account_type = at;
        balance = b;
    }

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Type: "+account_type);
        System.out.println("Balance: "+balance);
        System.out.println("Interest rate: "+interest_rate);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount depostited! New balance is : "+balance);
    }

    void withdraw(int amount) {
        if (balance - amount < min_balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Amount withdrawn! New balance is : "+balance);
    }

    static void display_interest() {
        System.out.println("Interest rate is : "+interest_rate+"%");
    }
}

public class ex3 {
    public static void main(String[] args) {
        BANK_ACCOUNT.display_interest();
        BANK_ACCOUNT s1 = new BANK_ACCOUNT();
        s1.display();
        BANK_ACCOUNT s2 = new BANK_ACCOUNT("Haider", 1, "Savings", 100000);
        s2.display();
        s2.deposit(100);
        s2.withdraw(2000);
    }
}
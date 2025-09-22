import java.util.Scanner;
import java.lang.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {
    private static final int CORRECT_PIN = 1234;
    private static double balance = 5000.0; 

    public ATM() {
        super();
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        try {
          
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin != CORRECT_PIN) {
                throw new SecurityException("Incorrect PIN entered!");
            }

           
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance! Your balance is only " + balance);
            }

          
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);

        } catch (SecurityException se) {
            System.out.println("Security Exception: " + se.getMessage());

        } catch (InsufficientBalanceException ibe) {
            System.out.println("Transaction Failed: " + ibe.getMessage());

        } finally {
            System.out.println("Thank you for using our ATM service.");
            sc.close();
        }
    }
}
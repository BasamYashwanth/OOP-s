import java.util.Scanner;
import java.lang.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}


class LimitExceedException extends Exception {
    public LimitExceedException(String message) {
        super(message);
    }
}

public class Library {
    private static int availableCopies = 2; 
    private static int userBorrowed = 0;    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Welcome to Library Management System");
            System.out.print("Enter book name you want to borrow: ");
            String book = sc.nextLine();

   
            if (availableCopies <= 0) {
                throw new BookNotAvailableException("Sorry! The book '" + book + "' is not available.");
            }

           
            if (userBorrowed >= 3) {
                throw new LimitExceedException("Borrow limit exceeded! You already borrowed 3 books.");
            }

           
            availableCopies--;
            userBorrowed++;
            System.out.println("You have successfully borrowed: " + book);
            System.out.println("Remaining copies: " + availableCopies);
            System.out.println("Total books you borrowed: " + userBorrowed);

        } catch (BookNotAvailableException bna) {
            System.out.println("Transaction Failed: " + bna.getMessage());

        } catch (LimitExceedException lee) {
            System.out.println("Transaction Failed: " + lee.getMessage());

        } finally {
            System.out.println("Transaction completed. Thank you for using Library Management System.");
            sc.close();
        }
    }
}
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}


class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}


class OnlineShopping {
    private String itemName;
    private double pricePerItem;

    public OnlineShopping(String itemName, double pricePerItem) {
        this.itemName = itemName;
        this.pricePerItem = pricePerItem;
    }

    public void placeOrder(int quantity) throws InvalidQuantityException, LimitExceededException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Invalid Quantity! Quantity must be greater than 0.");
        }

        double totalAmount = quantity * pricePerItem; 

        if (totalAmount > 50000) {
            throw new LimitExceededException("Order limit exceeded! Maximum allowed bill is 50000.");
        }

        System.out.println("Order confirmed for " + itemName + ".");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}


public class ShoppingPortal {
    public static void main(String[] args) {
        OnlineShopping order = new OnlineShopping("Laptop", 25000);

        try {
        
            order.placeOrder(2);  
           
        } catch (InvalidQuantityException | LimitExceededException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Thank you for shopping with us!");
        }
    }
}
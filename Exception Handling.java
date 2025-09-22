public class Main 
{
    static voud checkAge(int age) 
    {
        if (age < 18) 
        {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } 
        else 
        {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) 
    {
    Try{
        checkAge(15); 
    }   
    catch (ArithmeticException e) 
    {
        System.out.println("Error: " + e.getMessage());
    }   
    }
}

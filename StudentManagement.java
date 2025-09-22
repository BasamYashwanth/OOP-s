class InvalidMarksException extends Exception {
  public InvalidMarksException(String message) {
    super(message);
  }
}

public class StudentManagement
{
  static void calculateGrade(int marks) throws InvalidMarksException { 
    if (marks < 0 || marks > 100) {
      throw new InvalidMarksException("Marks should be between 0 and 100");
    }
    else if (marks >= 90)
    {
      System.out.println("Grade A");
    }
    else if (marks >= 75) {
      System.out.println("Grade: B");
    }
    else if (marks >= 50) {
      System.out.println("Grade: C");
    }
    else {
      System.out.println("Result: Fail");
    }
  }

  public static void main(String[] args) {
    try {
      calculateGrade(85);
    }
    catch (InvalidMarksException e) {
      System.out.println("Exception caught: " + e.getMessage());
    }
    finally {
      System.out.println("Result processed");
    }
  }
}
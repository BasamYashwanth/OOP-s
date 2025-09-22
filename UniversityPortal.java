class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class Course {
    private String courseName;
    private int maxSeats;
    private int currentSeats;

    public Course(String courseName, int maxSeats) {
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.currentSeats = 0;
    }

    public void registerStudent() throws CourseFullException {
        if (currentSeats < maxSeats) {
            currentSeats++;
            System.out.println("Student registered successfully for " + courseName +
                               " (Seats filled: " + currentSeats + "/" + maxSeats + ")");
        } else {
            throw new CourseFullException("Hello! Registration failed. The course '" 
                                          + courseName + "' is already full.");
        }
    }
}

public class UniversityPortal {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", 3); // Max 3 seats

        try {
           
            for (int i = 1; i <= 5; i++) {
                System.out.println("Registering student " + i + "...");
                course.registerStudent();
            }
        } catch (CourseFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Registration process completed.");
        }
    }
}
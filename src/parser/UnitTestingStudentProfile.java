package parser;
import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //implementation here...
        Student student = new Student("Rabhi", "ami", "Silver", "500");

        try {
            Assert.assertEquals(student.getFirstName(), "Rabhi");
            System.out.println("Test Passed getFirstName");
        } catch (AssertionError as) {
            System.out.println("Test Failed getFirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.getLastName(), "ami");
            System.out.println("Test passed lastName");
        } catch (AssertionError as) {
            System.out.println("Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }
        try {
            Assert.assertEquals(student.getId(), "100");
            System.out.println("Test passed getId");
        } catch (AssertionError as) {
            System.out.println("Test Failed getId");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.getScore(), "Silver");
            System.out.println("Test passed getScore");
        } catch (AssertionError as) {
            System.out.println("Test Failed getScore");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.toString(), "Student(id= 500)Rabhi ami  Grade = Silver");
            System.out.println("Test passed toString");
        } catch (AssertionError as) {
            System.out.println("Test Failed toString");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}
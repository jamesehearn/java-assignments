/**
  * Filename: Name.java
  * Author: James Hearn
  * Date: 09/03/2013
  * Purpose:
  * This class is declared as a public class that includes a main method
  * for creating an Employee object called johnDoe. The values for that
  * employee object are then printed to the screen.
  */

public class TestEmployee {

/**
 * Main method for creating an instance of an employee and printing those 
 * values to the screen.
 */
  public static void main(String [] theArgs)
  {
    /**
     * Creates & initalizes each data type with emplyee John Doe's information.
     */
    Name eName = new Name("John", "H.", "Doe");
    Address eAddy = new Address("123 Sunset Boulevard" ,"Beverly Hills","CA","99999");
    String eSocial = "123-45-6789";
    
    /**
     * Creates new Employee object and passes values above into new Employee object johnDoe.
     */
    Employee johnDoe = new Employee(eName, eAddy, eSocial);
    
    /**
     * Prints data for new Employee object johnDoe.
     */
    System.out.println("Employee:");
    johnDoe.print();
  }
}
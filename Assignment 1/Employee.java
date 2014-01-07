/**
  * Filename: Employee.java
  * Author: James Hearn
  * Date: 09/03/2013
  * Purpose: The Employee class is designed to keep all instance variables and accessor
  * methods private. It contains a public constructor to initialize all instance
  * variables a public print() method to print the values of an Employee object
  * to the screen. Other objects cannot access any data contained within an
  * Employee object; these values can only be accessed by a client who views them
  * on the screen.
  */

/**
 * Stores an employee's name as a Name Object, their address as an Address object, and their 
 * social security number as a string object.
 */
public class Employee 
{
  /**
   * Three private instance variables.
   */
  private Name name;
  private Address address;
  private String social;
  
  /**
   * One public Constructor:
   */
  public Employee ( Name theName, Address theAddress, String theSocial )
  {
    name = theName;
    address = theAddress;
    social = theSocial;
  }

  /**
   * Returns Name:
   */
  private Name getName ()
  {
    return name;
  }

  /**
   * Returns Address:
   */
  private Address getAddress ()
  {
    return address;
  }

  /**
   * Returns SSN:
   */
  private String getSocial ()
  {
    return social;
  }

  /**
   * Prints the values of the Employee object to the screen:
   */
  public void print ()
  {
    name.print();
    address.print();
    System.out.println(social);
  }
}  
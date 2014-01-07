/**
 * Assignment: Chapter 4
 * Programmer: James E. Hearn
 * Date: 10/08/2013
 * File: Fibonacci.java
 * Description: This class declares and defines a recursive method called fib that returns the 
 *             Fibonacci result of its argument. The return value will be of type long.
 */

public class Fibonacci {

  public static long fib( int theNum ) {
  /** Precondition: theNum is between 1 & 40
    * Returns the Fibonacci value of the input number
    */
    
    long result = 1;  //Create & instantiate the counter for the Fibonacci number (also represents base case)
    
    if ( theNum > 1 ) {  //Assuming the input is bigger than the base case
      result = ( fib( theNum - 1 ) + fib( theNum - 2 ));  //Use recursion to add the values of the previous two numbers
      theNum--;  //Decrement the input number (smaller-caller)
      }
    return result;  //General case
  }
}
/*
 * Program: IntList & RefList
 * File: PEX6.java
 * Author: James E. Hearn
 * Description: This file implemets a main method which tests ListInterface.java & RefList.java. 
 *             This file generates twenty random numebrs with values ranging from zero to four, 
 *             places those numbers in a RefList list, prints the list, and them prints the
 *            number of times each value appears in the list.
 */

import java.util.*; //Imports all classes in java.util package

public class PEX6 {

  public static void main ( String[] theArgs ) {
    
    //Declare a ListInterface<T> and instantiate as a new RefList<T>
    ListInterface<Integer> intList = new RefList<Integer>();//Ask about changing T to Integer
    
    //Generate twenty random numbers 0 - 4, and add each to the list with add method
    for ( int i = 0 ; i < 20 ; i++ ) {
      Random rand = new Random();
      int n = rand.nextInt(5);
      intList.add(n);
    }
    
    //Print contents of the list to the screen by calling writeLinkedList method
    intList.writeLinkedList(); 
      //Print the number of times each value appears in the list to the screen
    int zero = countValue( intList, 0 );
    System.out.println( "Occurences of 0: " + zero );
    int one = countValue( intList, 1 );
    System.out.println( "Occurences of 1: " + one );
    int two = countValue( intList, 2 );
    System.out.println( "Occurences of 2: " + two );
    int three = countValue( intList, 3 );
    System.out.println( "Occurences of 3: " + three );
    int four = countValue( intList, 4 );
    System.out.println( "Occurences of 4: " + four );
  }
  
  private static int countValue ( ListInterface<Integer> theList , int theValue ) {
    //Reset method initalizes theList for iteration
    theList.reset();
    
    //nFound stores the number of times theValue appears in the list
    int nFound = 0;
    
   /**For loop iterates through each element in theList and compares it to theValue by calling the equals
     * method of the element, passing theValue as an argument. If the element matched theValue, increment
     * nFound by one.
     */
    for ( int j = 0; j < theList.size() ; j++ ) {
      if ( theList.getNext() == theValue )
        nFound++;
    }
    
    return nFound;
  }
}
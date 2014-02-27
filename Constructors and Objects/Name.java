/**
  * Filename: Name.java
  * Author: James Hearn
  * Purpose: The Name class is designed to keep all instance variables and accessor
  * methods private. It contains a public constructor to initialize all instance
  * variables a public print() method to print the values of a Name object
  * to the screen. Other objects cannot access any data contained within an
  * Name object; these values can only be accessed by a client who views them
  * on the screen.
  */
 
/**
 * Stores a person's name (first, middle, last) as three individual
 * String objects:
 */
 public class Name
 {
     /**
      * Three private instance variables:
      */
     private String first;
     private String middle;
     private String last;
 
     /**
      * One public Constructor:
      */
     public Name ( String theFirst, String theMiddle, String theLast )
     {
         first = theFirst;
         middle = theMiddle;
         last = theLast;
     }
     
     /**
      * Returns first:
      */
     public String getFirst ()
     {
         return first;
     }
          
      /**
      * Returns middle:
      */
     public String getMiddle ()
     {
         return middle;
     }
      
     /**
      * Returns last:
      */
     public String getLast ()
     {
         return last;
     }
 
     /**
      * Print the values of a name object to the screen:
      */
     public void print ()
     {
       System.out.print(getFirst() + " " );
       System.out.print(getMiddle() + " " );
       System.out.println(getLast() );
     }
 }
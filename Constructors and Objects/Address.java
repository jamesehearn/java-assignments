/**
  * Filename: Address.java
  * Author: James Hearn
  * Purpose: The Address class is designed to keep all instance variables and accessor
  * methods private. It contains a public constructor to initialize all instance
  * variables a public print() method to print the values of an Address object
  * to the screen. Other objects cannot access any data contained within an
  * Address object; these values can only be accessed by a client who views them
  * on the screen.
  */
 
/**
 * Stores a person's address (street, city, state, zip code) as four individual
 * String objects:
 */
 public class Address
 {
 
     /**
      * Four private instance variables:
      */
     private String street;
     private String city;
     private String state;
     private String zip;
 

     /**
      * One public Constructor:
      */
     public Address ( String theStreet, String theCity, String theState, String theZip )
     {
         street = theStreet;
         city = theCity;
         state = theState;
         zip = theZip;
     }
 

     /**
      * Returns street:
      */
     public String getStreet ()
     {
         return street;
     }
 

     /**
      * Returns city:
      */
     public String getCity ()
     {
         return city;
     }
 

     /**
      * Returns state:
      */
     public String getState ()
     {
         return state;
     }
 

     /**
      * Returns zip:
      */
     public String getZip ()
     {
         return zip;
     }
 

     /**
      * Prints the values of an Address object to the screen:
      */
     public void print ()
     {
         System.out.print( getStreet() + ", " );
         System.out.print( getCity() + ", " );
         System.out.print( getState() + ", " );
         System.out.println( getZip() );
     }
 
}
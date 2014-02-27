/**
 * File: UnboundedStackInterface.java
 * Assignment: Palindrome
 * Programmer: James E. Hearn
 * Description: This public interface declares all necessary methods that any unbounded 
 *             stack-type data structure should contain.
 */

public interface UnboundedStackInterface<T>
 {
 
    /**
      * Should return true if this stack is empty or false otherwise:
      */
     boolean isEmpty ();
 

    /**
      * Should "add" the given object to this Stack:
      */
     void push ( T theObject );
 

    /**
      * Should remove the "top" element from this stack or throw a
      * RuntimeException if this stack is empty:
      */
     void pop () throws RuntimeException;
 

    /**
      * Should return a reference to the "top" element on this stack or throw
      * a RuntimeException if this stack is empty:
      */
      T top () throws RuntimeException;
 
}
/**
 * File: UnboundedQueueInterface.java
 * Assignment: Palindrome
 * Programmer: James E. Hearn
 * Description: This public interface declares all necessary methods that any unbounded 
 *             Queue-type data structure should contain.
 */

public interface UnboundedQueueInterface<T>
 {
 
    /**
      * Should return true if this queue is empty or false otherwise:
      */
     boolean isEmpty ();
 

    /**
      * Should place the given object on the rear of this queue:
      */
     void enqueue ( T theObject );
 

    /**
      * Should remove the "front" element form this queue and return a reference
      * to it or throw a RuntimeException if this queue is empty:
      */
      T dequeue() throws RuntimeException;
 
} 
/*
 * Program: Assignment 6
 * File: ListInterface.java
 * Date: 11/08/2013
 * Author: James E. Hearn
 * Description: This file is an interface that provides all necessary methods that any unsorted 
 *             reference-based list should contain.
 */

public interface ListInterface<T>
 {
 
    /**
      * Should return the number of elements contained within this list:
      */
     int size ();
 

    /**
      * Should return true if this list contains a copy of the given object:
      *
      * Comparisons should be performed by calling the equals(...) method of
      * each element, passing the given object as an argument
      */
     boolean contains ( T theObject );
 

    /**
      * Should remove the first element found within this list that exists as a
      * copy of the given object and return true if such an element was found:
      */
     boolean remove ( T theObject );
 

    /**
      * Should return a reference to the first element found within this list
      * that exists as a copy of the given object or null if no such element was
      * found:
      */
     Object get ( T element );
 

    /**
      * Should return a nicely formatted string representation of this list:
      */
     String toString ();
 

    /**
      * Should print the contents of this list to the screen:
      */
     void writeLinkedList ();
 

    /**
      * Should initialize this list for iteration (use of the getNext() method):
      */
     void reset ();
 

    /**
      * Should return a reference to the element located at the iterator's
      * current position and increment the iterator:
      *
      * If the iterator is currently pointing to the last element in this list,
      * the iterator should be reset to point to the first element in this list.
      *
      * @Preconditions:
      *     This list is not empty.
      *     This list has been reset.
      *     This list has not been modified since the last reset.
      */
      T getNext ();
 

    /**
      * Should insert the given object onto the front of this list:
      */
     void add ( T theObject );
 
} 
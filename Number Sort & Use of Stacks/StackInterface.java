/**
 * Programmer: James E. Hearn
 * Program: Number Sort and Use of Stacks
 * File: StackInterface.java
 * Description: Interface that declares all methods for stack-type data strctures.
 */

public interface StackInterface<T>
{
  /**
   * Return true if the stack contains no elements
   */
 boolean isEmpty ();
 
 /**
  * Return true if the stack contains all elements from the ArrayStack
  */
 boolean isFull ();
 
 /**
  * Places the next T object (theObject) on top of the stack. Throws a RuntemeException if the stack is full.
  */
 void push (T theObject) throws RuntimeException;
 
 /**
  * Removes the top T object from the stack. Throws a RuntimeException if stack is empty.
  */
 void pop () throws RuntimeException;
 
 /**
  * Returns the top element from the stack. Throw a RuntimeException if the stack is empty.
  */
 T top () throws RuntimeException;
}
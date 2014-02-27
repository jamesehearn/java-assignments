/**
 * Programmer: James E. Hearn
 * Program: Number Sort and Use of Stacks
 * File: ArrayStack.java
 * Description: A public class that implements the StackInterface interface. This class stores an array object 
 *              and provides methods to manipulate arrays using StackInterface functions.
 */

public class ArrayStack<T> implements StackInterface<T> {

  /**
   * Declare variables
   */
  protected static final int DEFCAP = 100;    //Default capacity of ArrayStack
  
  protected T[] array = null;    //Stores elements of ArrayStack
  
  protected int topIndex = -1;    //Stores the top index of the ArrayStack
  
  /**
   * Constructors
   */
  public ArrayStack () {    //Default capacity
    array = (T[]) new Object [ DEFCAP ];
  }
  
  public ArrayStack (int theCapacity) {    //Given capacity
    array = (T[]) new Object [ theCapacity ];
  }
  
  /**
   * Methods
   */
  
  /**
   * Returns true if this stack contains no elements, otherwise returns false
   */
  public boolean isEmpty () {
    return topIndex == -1;
  }

  /**
   * Returns true if this stack is full, otherwise returns false
   */
  public boolean isFull () {
    return topIndex == (array.length - 1);
  }
  
  /**
   * Throws a RuntimeException if this stack is full, otherwise places the given object on top of this stack
   */
  public void push (T theObject) { //Original Requirementsd state Object theObject, not T
    if (!isFull()) {
      topIndex++;
      array [ topIndex ] = theObject;
    }
    else
      throw new RuntimeException( "Push attempted on a full stack." );
  }
  
  /**
   * Throws a RuntimeException if this stack is empty, otherwise removes the top element from this stack
   */
  public void pop () {
    if (!isEmpty()) {
      array [ topIndex ] = null;
      topIndex--;
      }
     else
       throw new RuntimeException ( "Pop attempted on an empty stack." );
  }

  /**
   * Throws a RuntimeException if this stack is empty, otherwise returns the
   * top element from this stack:
   */
  public T top () {
    T topOfStack = null;
       if (!isEmpty())
         topOfStack = array[ topIndex ];
       else
          throw new RuntimeException( "Top attempted on an empty stack." );
 
        return topOfStack;
     }

}
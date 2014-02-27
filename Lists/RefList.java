/*
 * Program: Assignment 6
 * File: RefList.java
 * Date: 11/08/2013
 * Author: James E. Hearn
 * Description: This file contains a public class that implements the ListInterface. This file stores a 
 *             colleciton of objects and provide the methods necessary to manipulate that collection in 
 *             accordance with the ListInterface functionality.
 */


/**
  * The LLObjectNode declaration may (and should) be contained within the same
  * file as the RefList declaration:
  */
 class LLObjectNode<T>
 {
 
    private LLObjectNode<T> link;
     private T info;
 

    public LLObjectNode ( T theInfo )
     {
         info = theInfo;
         link = null;
     }
 

    public void setInfo ( T theInfo )
     {
         info = theInfo;
     }
 

    public T getInfo ()
     {
         return info;
     }
 

    public void setLink ( LLObjectNode<T> theLink )
     {
         link = theLink;
     }
 

    public LLObjectNode<T> getLink ()
     {
         return link;
     }
 
}
 

/**
  * Stores and manipulates a collection of objects in accordance with the
  * ListInterface functionality:
  */
 public class RefList<T> implements ListInterface<T>
 {
 
    /**
      * Stores the number of elements contained within this list:
      */
     protected int numElements;
 

    /**
      * Points to the first node on this list:
      *
      * This variable will be set to null, when the list is empty.
      */
     protected LLObjectNode<T> first;
 

    /**
      * Used for iteration through this list:
      *
      * This variable will be set to null until a call is made to the reset()
      * method, at which point this variable will point to the first element on
      * this list:
      */
     protected LLObjectNode<T> currentPos;
 

    /**
      * Used for locating elements on this list:
      */
     //Set to true if find(...) is successful:
     protected boolean found;
 
    //Points to the found element:
     protected LLObjectNode<T> location;
 
    //Points to the element preceding the found element:
     protected LLObjectNode<T> previous;
 

    /**
      * Attempts to find an element contained within this list that exists as a
      * copy of the given object:
      *
      * If the find is successful, the found variable will be set to true, the
      * location variable will point to the found element, and the previous
      * variable will point to the element preceding the found element, unless
      * the found element is the first element on this list.
      */
     protected void find ( T theTarget )
     {
         found = false;
         location = first;
         previous = null;
 
        while ( location != null )
         {
             if ( location.getInfo().equals( theTarget ) )
             {
                 found = true;
 
                break;
             }
             else
             {
                 previous = location;
                 location = location.getLink();
             }
         }
     }
 

    /**
      * Creates an empty list:
      */
     public RefList()   //Originally public RefList<T>()
     {
         currentPos = null;
         first = null;
         numElements = 0;
     }
 

    /**
      * Returns the number of elements contained within this list:
      */
     public int size()
     {
         return numElements;
     }
 

    /**
      * Returns true if this list contains a copy of the given object:
      */
     public boolean contains ( T theTarget )
     {
         find( theTarget );
 
        return found;
     }
 

    /**
      * Removes the first element found within this list that exists as a copy
      * of the given object and returns true of such an element was found:
      */
     public boolean remove ( T theTarget )
     {
         find( theTarget );
 
        if ( found )
         {
             if ( location == first )
                 first = first.getLink();
             else
                 previous.setLink( location.getLink() );
 
            --numElements;
         }
 
        return found;
     }
 

    /**
      * Returns a reference to the first element found within this list that
      * exists as a copy of the given object or null if no such element was
      * found:
      */
     public T get ( T theTarget )
     {
         find( theTarget );
 
        if ( found )
             return location.getInfo();
         else
             return null;
     }
 

    /**
      * Returns a nicely formatted string representation of this list:
      */
     public String toString ()
     {
         LLObjectNode node = first;
         StringBuffer buff = new StringBuffer ( "List:" );
 
        while ( node != null )
         {
             buff.append( " " + node.getInfo() );
             node = node.getLink();
         }
 
        return buff.toString();
     }
 

    /**
      * Prints the contents of this list to the screen:
      */
     public void writeLinkedList ()
     {
         System.out.println( toString() );
     }
 

    /**
      * Initializes this list for iteration:
      */
     public void reset ()
     {
         currentPos = first;
     }
 

    /**
      * Returns a reference to the element located at currentPos and increments
      * currentPos to point to the next element contained within this list:
      *
      * If currentPos is pointing to the last element in this list, it will be
      * reset to point to the first element in this list.
      *
      * @Preconditions:
      *     This list is not empty.
      *     This list has been reset.
      *     This list has not been modified since the last reset.
      */
     public T getNext ()
     {
         Object next = currentPos.getInfo();
 
        if ( currentPos.getLink() == null )
             currentPos = first;
         else
             currentPos = currentPos.getLink();
 
        return (T) next;
     }
 

    /**
      * Inserts the given object onto the front of this list:
      */
     public void add ( T theObject )
     {
         LLObjectNode<T> node = new LLObjectNode<T>( theObject );
 
        node.setLink( first );
         first = node;
         ++numElements;
     }
 
} 
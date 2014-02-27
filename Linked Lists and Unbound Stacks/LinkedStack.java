/**
 * File: LinkedStack.java
 * Assignment: Palindrome
 * Programmer: James E. Hearn
 * Description: This public clas simplements the UnboundedStackInterface and is used to 
 *             store a linked list of objects and provide the methods necessary to manipulate
 *             that list in accordance with the UnboundStatckInterface funcitonality.
 */

class LLObjectNode<T>
 {
 
    /**
      * Points to the node that follows this node in a collection:
      */
    private LLObjectNode<T> link;
  

    /**
      * Points to the data stored by this node:
      */
     private T info;
 

    /**
      * Instantiates a new node with the given data (info):
      */
     public LLObjectNode ( T theInfo )
     {
         info = theInfo;
         link = null;
     }
 

    /**
      * Assigns the given data to this node:
      */
     public void setInfo ( T theInfo )
     {
         info = theInfo;
     }
 

    /**
      * Returns the data stored by this node:
      */
     public T getInfo ()
     {
         return info;
     }
 

    /**
      * Assigns which node should follow this node in a collection:
      */
     public void setLink ( LLObjectNode<T> theLink )
     {
         link = theLink;
     }
 

    /**
      * Returns the node that follows this node in a collection:
      */
     public LLObjectNode<T> getLink ()
     {
         return link;
     }
 
}



/**
  * Implements the UnboundedStackInterface using a linked list:
  */
 public class LinkedStack<T> implements UnboundedStackInterface<T>
 {
 
    /**
      * Points to the "top" element on this stack:
      *
      * If this stack is empty, top will be set to null.
      */
     protected LLObjectNode<T> top;
 

    /**
      * Creates an empty stack:
      */
     public LinkedStack () //Originally LinkedStack<T>
     {
         top = null;
     }
 

    /**
      * Returns true if this stack is empty:
      */
     public boolean isEmpty ()
     {
         return top == null;
     }
 

    /**
      * Places the given object on top of this stack:
      */
     public void push ( T theObject )
     {
         LLObjectNode<T> newNode = new LLObjectNode<T>( theObject );
 
        newNode.setLink( top );
         top = newNode;
     }
 

    /**
      * Removes the top element from this stack or throws a RuntimeException if
      * this stack is empty:
      */
     public void pop ()
     {
         if ( !isEmpty() )
             top = top.getLink();
         else
             throw new RuntimeException( "Pop attempted on an empty stack." );
     }
 

    /**
      * Returns the top element on this stack or throws a RuntimeException if
      * this stack is empty:
      *
      * Note that a reference to the top node's data is returned -- not a
      * reference to the top node itself.
      */
     public T top ()
     {
         if ( !isEmpty() )
             return top.getInfo();
         else
             throw new RuntimeException( "Top attempted on an empty stack." );
     }
 
 
}
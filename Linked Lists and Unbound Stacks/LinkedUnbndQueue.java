/**
 * File: LinkedUnbndQueue.java
 * Assignment: Palindrome
 * Programmer: James E. Hearn
 * Description: This public clas simplements the UnboundedQueueInterface and is used to 
 *             store a linked list of objects and provide the methods necessary to manipulate
 *             that list in accordance with the UnboundQueueInterface funcitonality.
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
  * Implements the UnboundedQueueInterface using a linked list:
  */
 public class LinkedUnbndQueue<T> implements UnboundedQueueInterface<T>
 {
 
    /**
      * Points to the "front" node in this queue:
      */
     protected LLObjectNode<T> front;
 

    /**
      * Points to the "rear" node in this queue:
      *
      * The queue is empty if front and rear are both set to null; when the
      * queue contains exactly one element, front and rear will both point to
      * the same node.
      */
     protected LLObjectNode<T> rear;
 

    /**
      * Instantiates an empty queue:
      */
     public LinkedUnbndQueue () //Originally was LinkedUnbndQueue<T>
     {
         front = null;
         rear = null;
     }
 

    /**
      * Returns true if this queue is empty:
      */
     public boolean isEmpty ()
     {
         return front == null;
     }
 

    /**
      * Places the given object on the rear of this queue:
      */
     public void enqueue ( T theObject )
     {
         LLObjectNode<T> newNode = new LLObjectNode<T>( theObject );
 
        if ( rear == null )
             front = newNode;
         else
             rear.setLink( newNode );
 
        rear = newNode;
     }
 

    /**
      * Removes the "front" object from this queue and returns it or throws a
      * RuntimeException if this queue is empty:
      */
     public T dequeue ()
     {
         if ( isEmpty() )
             throw new RuntimeException( "Dequeue attempted on an empty queue." );
         else
         {
             T frontData = front.getInfo();
 
            front = front.getLink();
 
            if ( front == null )
                 rear = null;
 
            return frontData;
         }
     }
 
} 
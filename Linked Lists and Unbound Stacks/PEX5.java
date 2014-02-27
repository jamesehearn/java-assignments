/**
 * File: PEX5.java
 * Assignment: Palindrome
 * Programmer: James E. Hearn
 * Description: This public class implements a main method to test UnboundedQueueInterface.java,
 *             UnboundedStackInterface.java, LinkedQueueInterface.java, and LinkedUnbndQueue.java.
 *             This method tests whether an input is a palindrome or not.
 */
//Import the java.util.Scanner file for input.
import java.util.Scanner;  

public class PEX5 {
  public static void main(String[] theArgs) {
    //2.Declare a Scanner object by passing System.in as a parameter to the Scanner constructor.
    Scanner scanner = new Scanner(System.in);

    char stackTop, queueEnd;
    boolean stillPalindrome = true;
    boolean again = true;
    
    //Declare an UnboundedStackInterface, and instantiate it as a new LinkedStack.
    UnboundedStackInterface stack = new LinkedStack();      
    
    //Declare an UnboundedQueueInterface, and instantiate it as a new LinkedUnbndQueue.
    UnboundedQueueInterface queue = new LinkedUnbndQueue();
    
    do {
      //Print a prompt to the user to enter a string that will be evaluated.
      System.out.println("Enter a string to be evaluated:");
      
      //Get a String from the Scanner object by calling its nextLine() method.
      String testString = scanner.nextLine();
      
      //Iterate through each character in the String, placing each character onto the stack as well as onto the queue.
      for (int i = 0; i < testString.length(); i++) {
        stack.push(testString.charAt(i));
        queue.enqueue(testString.charAt(i));
      }
      
      //Determine whether the String is a palindrome by comparing each character popped off of the 
      //stack to each character dequeued from the queue. Since the stack pops characters in the 
      //reverse order of which they were added and the queue dequeues characters in the 
      //same order in which they were added, the characters from any normal String would not match; 
      //only a perfect palindrome would pass the test.
      while (!stack.isEmpty() && !queue.isEmpty()) {
        stackTop = (Character)stack.top();
        queueEnd = (Character)queue.dequeue();
        
        if (stackTop != queueEnd)
          stillPalindrome = false;
        else {
          stack.pop();
        }
      }  

      if (stillPalindrome)
        System.out.println(testString + " is a palindrome.");
      else
        System.out.println(testString + " is not a palindrome.");  
      System.out.print("\n");
      System.out.print("Would you like to evaluate another string?" + "\n");
      
      String answer = scanner.nextLine();
      
      if (answer == "N")
        again = false;
    } while (again);
  }
}
/**
 * Programmer: James E. Hearn
 * Program: Number Sort and Use of Stacks
 * File: PEX3.java
 * Description: A public class that applies the ArrayStack implementation. This program asks the user for 
 *             20 integers, sorts them into an even stack and an odd stack, and then prints each stack,
 *             individually, in order reverse of how the user input the numbers.
 */

import java.util.Scanner; //Import Scanner for keyboard input

public class PEX3 { 
  public static void main(String[] theArgs) {
    
    /**
     * Declare & initialize variables
     */
    
    Scanner scanner = new Scanner(System.in);                       //Initialize Scanner object for keyboard dinput
    
    StackInterface<Integer> evenStack = new ArrayStack<Integer>();  //Initalize a new Integer stack, named evenstack
    
    StackInterface<Integer> oddStack = new ArrayStack<Integer>();   //Initalize a new Integer stack, named oddStack
    
    int input;  //Declare an int for processing the twenty integers into stacks
    
    /**
     * Ask user for twenty integers
     */
    System.out.println("Run:" + "\n" + "\n");
    System.out.println("Enter 20 integers: " + "\n" + "\n");
    
    /**
     * For each integer input, if it is divisible by two, push it to the even stack
     * If the integer is NOT divisible by two, push it to the odd stack
     */
    for (int i = 0;  i < 20; i++) {
      input = scanner.nextInt();
    if (input % 2 == 0)
      evenStack.push(input);
    else
      oddStack.push(input);
    }
    
    System.out.println("\n");
    
    /**
     * Print the top integer on the even stack, and pop the top integer off, until isEmpty is true
     */
    System.out.println("Even integers in reverse order:" + "\n" + "\n");
    
    while (!evenStack.isEmpty()) {
     System.out.print(evenStack.top() + " ");
     evenStack.pop();
    }
    
    System.out.println("\n" + "\n");

    /**
     * Print the top integer on the off stack, and pop the top integer off, until isEmpty is true
     */
    System.out.println("Odd integers in reverse order:" + "\n" + "\n");
    
    while (!oddStack.isEmpty()) {
     System.out.print(oddStack.top() + " ");
     oddStack.pop();
    }

    System.out.println("\n" + "\n");

  }
}
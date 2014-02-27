/**
 * Assignment: Fibonacci Sequence
 * Programmer: James E. Hearn
 * File: FibonacciJPanel.java
 * Description: This class extends JPanel and implementsd ActionListener. This class provides a GUI 
 *             that displays the Fibonacci value of an integer input.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FibonacciJPanel extends JPanel implements ActionListener {
  /**
    * This JTextField is used to capture input from the keyboard and is
    * instantiated with an integer argument of 15, signifying that it
    * should be (at least) large enough to display 15 characters at once.
    */
    private JTextField inputText = new JTextField( 15 );
    
   /**
    * Another JTextField is used to display output which is generated when the
    * user clicks the button located near the bottom of the GUI, or presses
    * the "Enter" key. In the case of this example, the output declares
    * is the actual Fibonacci value of the input.
    */
    private JTextField outputText = new JTextField( 15 );

   /**
    * A JLabel is a simple GUI component whose only function is to display
    * a String that direct the user or provide information.
    */
    private JLabel inputLabel = new JLabel( "Input a Number (40 max):" );
    private JLabel outputLabel = new JLabel( "Fibonacci Result:" );
            
   /**
     * This JButton captures clicks from the user's mouse and, in turn, sends a
     * message back to the FibonacciJPanel object so that the object may act
     * upon the user's click.
     */
    private JButton goButton = new JButton( "Get Fibonacci" );
            
   /**
    * A JPanel can be created to group together other components for the
    * purpose of well-organized appearance of the GUI.
    */
    private JPanel drawingArea = new JPanel ();
    
   /**
    * The default constructor sets up the user interface by defining the
    * layout of all of the visible components, as well as establishing the
    * instantiated Fibonacci Object as an ActionListener who must be notified
    * when the goButton is pressed or input is entered in the inputTextField.
    */
    public FibonacciJPanel () {
       //Sets the layout of the FibonacciJPanel object
      drawingArea.setLayout(new GridLayout( 0, 1, 0, 15 ));
      add( drawingArea );
      
       //Sets the layout of all input components:
      drawingArea.add( inputLabel );
      drawingArea.add( inputText );
        
       //Sets the layout of all action components:
      drawingArea.add( goButton );
      
       //Sets the layout of all output components
      drawingArea.add( outputLabel );
      drawingArea.add( outputText );

       //Establishes this object as an ActionListener to the goButton and the inputTextField
      goButton.addActionListener( this );
      inputText.addActionListener( this );
      }

   /**
    * The actionPerformed(...) method must be defined by any class that
    * implements the ActionListener interface. This is where the real magic
    * happens. When the user clicks the goButton or enters input into the
    * inputTextField, this method is called, and an ActionEvent object is
    * passed into it as an argument. The ActionEvent object contains all kinds
    * of useful information, such as the source of the call (i.e., if the
    * goButton was clicked, the ActionEvent's source will be the goButton; if
    * input was entered into the inputTextField, the ActionEvent's source will
    * be the inputTextField).
    */
   public void actionPerformed ( ActionEvent theEvent )
     {
     //Convert the input string to an integer
     int theNum = Integer.parseInt( inputText.getText() );
       
     //Check that the precondition for the fib method is met
     if (theNum < 1 || theNum > 40) {
       outputText.setText( "Enter a number between 1 and 40" );
     }
     else {
     //Find the Fibonacci Value of the input and store in theResult
     long theResult = Fibonacci.fib( theNum );
     
     //Output the appropriate response
     outputText.setText( "The Fibonacci of " + theNum + " is " + theResult );
     }  
     }

}
/**
 * Assignment: Chapter 4
 * Programmer: James E. Hearn
 * Date: 10/08/2013
 * File: FibonacciJApplet.java
 * Description: This class extends JApplet and implements an init() method
 */

import javax.swing.*;

public class FibonacciJApplet extends JApplet {
  
  /**
   * Init method sets up the applet
   */
  public void init () {
    
    getContentPane().add( new FibonacciJPanel () );
  }
  
}
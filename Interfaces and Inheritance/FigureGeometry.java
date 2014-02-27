/*
 * Name: James Hearn
 * Project: Circle
 * File: FigureGeometry.java
 * Description: This interface declares all of the methods that any geometric figure should contain.
 */

public interface FigureGeometry {
 
  /*
   * Constant declaration
   */
  final float PI = 3.14f;
  
  /*
   * Abstract accessor for returning the area
   */
  
  float getArea ();

  /*
   * Abstract accessor for returning the perimeter
   */
  
  float getPerimeter ();

}
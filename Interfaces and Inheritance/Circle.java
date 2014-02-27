/*
 * Name: James Hearn
 * Project: Circle
 * File: Circle.java
 * Description: This class implements the FigureGeometry interface included with this file.
 *              This class stores the radius of a circular figure and provides methods to 
 *               calculate area and perimeter.
 */

public class Circle implements FigureGeometry {
 /*
  * Declare private variables.
  */
  private float radius;
  
  /*
   * Constructor to initalize Circle with raduis
   */
  public Circle (float theRaduis) {
    radius = theRaduis;
  }
  
  /*
   * Accessor to return Circle radius
   */
  public float getRadius () {
    return radius;
  }
  
  /*
   * Accessor to return Circle area
   */
  public float getArea () {
    return getRadius() * getRadius() * PI;
  }
  
  /*
   * Accessor to return Circle perimeter
   */
  public float getPerimeter () {
    return getRadius() * 2 * PI;
  }
  
  /*
   * Modifier to set the Circle's raduis
   */
  public void setRaduis (float theRaduis) {
    radius = theRaduis;
  }
}
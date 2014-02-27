/*
 * Name: James Hearn
 * Project: Circle
 * File: Rectangle.java
 * Description: This class implements the FigureGeometry interface included with this file.
 *              This class stores the point of a rectangle using the Point class and calculates
 *                the area and perimeter of a rectangle.
 */

public class Rectangle implements FigureGeometry {
 /*
  * Declare variables
  */
  private Point point;
  
 /*
  * Constructor to initalize the Point of a Rectangle object
  */
  public Rectangle (Point p) {
    point = p;
  }
  
  /*
   * Accessor to return the width of a rectangle object
   */
  public int getWidth () {
    return point.getWidth();
  }
  
  /*
   * Accessor to return the height of a rectangle object
   */
  public int getHeight () {
    return point.getHeight();
  }
  
  /*
   * Accessor to return the area of a rectangle object
   */
  public float getArea () {
    return getWidth() * getHeight();
  }
  
  /*
   * Accessor to return the perimeter of a rectangle object
   */
  public float getPerimeter () {
    return ( getWidth() + getHeight() ) * 2;
  }
  
  /* 
   * Modifier to assign the point of the rectangle object
   */
  public void setPoint (Point p) {
    point = p;
  }
  
  
}
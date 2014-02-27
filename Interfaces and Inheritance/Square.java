/*
 * Name: James Hearn
 * Project: Circle
 * File: Square.java
 * Description: This class implements the FigureGeometry interface included with this file.
 *              This class stores the point of a square using the Point class and calculates
 *                the area and perimeter of a square.
 */

public class Square implements FigureGeometry {
  /*
   * Declare variables
   */
  private Point point;
  
  /*
   * Contstructor to initalizae the Point of the square
   */
  public Square (Point p) {
    point = p;
  }
  
  /*
   * Accessor to return the length of a Square object
   */
  public int getSideLength () {
    return point.getWidth();
  }
  
  /*
   * Accessor to return the area of a Square object
   */
  public float getArea () {
    return getSideLength() * getSideLength();
  }
  
  /*
   * Accessor to return the perimeter of a Square object
   */
    public float getPerimeter () {
      return getSideLength() * 4;
    }
  
  /*
   * Modifier to assign the side length of a Square object
   */
    public void setPoint(Point p) {
      point = p;
    }
      
    
}
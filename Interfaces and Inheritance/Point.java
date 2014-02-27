/*
 * Name: James Hearn
 * Project: Circle
 * file: Point.java
 * Description: This class stores a point (width and height) of a two-dimensional geometric figure.
 */

public class Point {
 /*
  * Declare private variables.
  */
  private int width, height;
  
  /*
   * Constructor to initalize Point with a width & height
   */
  public Point(int theWidth, int theHeight) {
    width = theWidth;
    height = theHeight;
  }

  /*
   * Accessor to return Point width
   */
  public int getWidth() {
   return width; 
  }

  /*
   * Accessor to return Point height
   */
  public int getHeight() {
   return height; 
  }

  /*
   * Modifier to set Point width
   */
  public void setWidth (int theWidth){
    width = theWidth;
  }

  /*
   * Modifier to set Point height
   */
  public void setHeight (int theHeight) {
    height = theHeight;
  }

}
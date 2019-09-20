public class Circle {
  /**
   * property
   */
  protected final double PI = 3.14;
  private double radius = 1.0;
  private String color = "red";

  /**
   * constructor
   */
  
  /**
   * 
   */
  public Circle() {

  }

  /**
   * 
   * @param radius
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * 
   * @param radius
   * @param color
   */
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
  
  /**
   * @return the radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * @param radius the radius to set
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * 
   * @return area of circle
   */
  public double getArea() {
    return this.PI * this.radius * this.radius;
  }

  /**
   *
   * @return string
   */
  public String toString() {
    return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
  }
}
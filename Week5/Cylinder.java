public class Cylinder extends Circle {
  /**
   * property
   */
  private double height = 1.0;

  /**
   * constructor
   */
  
  /**
   * 
   */
  public Cylinder() {

  }

  /**
   * 
   * @param radius
   */
  public Cylinder(double radius) {
    super(radius);
  }

  /**
   * 
   * @param radius
   * @param height
   */
  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  /**
   * 
   * @param radius
   * @param height
   * @param color
   */
  public Cylinder(double radius, double height, String color) {
    super(radius, color);
    this.height = height;
  }
  
  /**
   * @return the height
   */
  public double getHeight() {
    return height;
  }

  /**
   * @param height the height to set
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * 
   * @return volume of cylinder
   */
  public double getVolume() {
    return super.getArea() * this.height;
  }

  /**
   *
   * @return String
   */
  public String toString() {
    String circle = super.toString();

    return "Cylinder[" + circle + ",height=" + this.height +"]";
  }
  
  /**
   *
   * @return area of cylinder
   */
  public double getArea() {
    double twoBottom = super.getArea() * 2;

    return twoBottom + 2 * this.PI * super.getRadius() * this.height;
  }
}
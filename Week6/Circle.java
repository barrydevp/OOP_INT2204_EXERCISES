public class Circle extends Shape {
    final static double PI = 3.14;
    protected double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
     * @return Area
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * @return Perimeter
     */
    public double getPerimeter() {
        return PI * this.radius * 2;
    }
    
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }

}
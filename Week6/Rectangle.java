public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }
    
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return Area
     */
    public double getArea() {
        return width * length;
    }

    /**
     * @return Perimeter
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]";
    }

}
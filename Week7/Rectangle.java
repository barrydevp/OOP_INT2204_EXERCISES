public class Rectangle extends Shape {
    protected double width;
    protected double length;

    protected Point topLeft;

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
        this.topLeft = new Point();
    }

    public Rectangle(double width, double length) {
        super();
        if(width >= 0 && length >= 0) {
            this.width = width;
            this.length = length;
        } else {
            this.width = 0;
            this.length = 0;
        }
        this.topLeft = new Point();
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        if(width >= 0 && length >= 0) {
            this.width = width;
            this.length = length;
          } else {
            this.width = 0;
            this.length = 0;
          }
        this.topLeft = new Point();
    }

    public Rectangle(Point other, double width, double length, String color, boolean filled) {
        super(color, filled);
        if(width >= 0 && length >= 0) {
            this.width = width;
            this.length = length;
          } else {
            this.width = 0;
            this.length = 0;
          }
        this.topLeft = other;
        // this.topLeft = new Point(other);
    }

    /**
     * @return the topLeft
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * @param topLeft the topLeft to set
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        if(width >= 0) {
            this.width = width;
          }
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
        if(length >= 0) {
            this.length = length;
          }
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
    
    /**
     * 
     * @param obj
     * @return comparision two Rectangle
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {

            Rectangle other = (Rectangle) obj;
            
            // compare this vs other here
            if(Math.abs(this.width - other.width) > 0.001) return false;
            if(Math.abs(this.length - other.length) > 0.001) return false;
            if(!this.topLeft.equals(other.topLeft)) return false;

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int prime = 19;
        int result = 1;
        result = result * prime + Double.valueOf(this.width).hashCode();
        result = result * prime + Double.valueOf(this.length).hashCode();
        System.out.println(result * prime + this.topLeft.hashCode());
        return result * prime + this.topLeft.hashCode();
    }

    /**
     * @return String
     */
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString() + ",width=" + this.width + ",length=" + this.length + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
        // return "Rectangle[" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]";
    }

}
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
      if(width >= 0 && length >= 0) {
        this.width = width;
        this.length = length;
      } else {
        this.width = 0;
        this.length = 0;
      }
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
		  return this.width * this.length;
        // return Math.round(this.width * this.length * 100.0) / 100.0;
    }

    /**
     * @return Perimeter
     */
    public double getPerimeter() {
		  return 2.0 * (this.width + this.length);
        // return Math.round( 2.0 * (this.width + this.length) * 100.0) / 100.0;
    }
    
    public String toString() {
      return "Rectangle[width=" + this.width + ",length=" + this.length + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
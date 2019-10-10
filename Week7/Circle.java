public class Circle extends Shape {
    final static double PI = 3.14;
    protected double radius;

    protected Point center;

    public Circle() {
        super();
        this.radius = 0;
        this.center = new Point();
    }

    public Circle(double radius) {
        super();
        if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
        this.center = new Point();
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
        this.center = new Point();
    }

    public Circle(Point other, double radius, String color, boolean filled) {
        super(color, filled);
        if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
        this.center = other;
        // this.center = new Point(other);
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
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
        if(radius >= 0) {
			this.radius = radius;
		}
    }
    
    /**
     * @return Area
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
        // return Math.round(Math.PI * this.radius * this.radius * 100.0) / 100.0;
    }

    /**
     * @return Perimeter
     */
    public double getPerimeter() {
        return Math.PI * this.radius * 2.0;
        // return Math.round(Math.PI * this.radius * 2.0 * 100.0) / 100.0;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {

            Circle other = (Circle) obj;
            
            // compare this vs other here
            if(Math.abs(this.radius - other.radius) > 0.001) return false;
            if(!this.center.equals(other.center)) return false;

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int prime = 19;
        int result = 1;
        result = result * prime + Double.valueOf(this.radius).hashCode();
        return result * prime + this.center.hashCode();
    }

    /**
     * @return String
     */
    public String toString() {
        return "Circle[center=" + this.center.toString() + ",radius=" + this.radius + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
        // return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }


}
public class Circle extends Shape {
    final static double PI = 3.14;
    protected double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        super();
        if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
		if(radius >= 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
        
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
    
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
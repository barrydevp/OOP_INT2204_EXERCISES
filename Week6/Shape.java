public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        // this.color = "White";
        // this.filled = false;
    }

    public Shape(String color, boolean filled) {
		// if(color != null)
			this.color = color;
        // else this.color = "White";
        this.filled = filled;
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
		if(color != null)
			this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    };
}
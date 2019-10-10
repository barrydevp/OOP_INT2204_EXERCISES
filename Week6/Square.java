public class Square extends Rectangle {

    public Square() {
        super();
        this.width = 0;
        this.length = 0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * @return the side
     */
    public double getSide() {
        return this.width;
    }
    
    /**
     * @param side the width and length to set
     */
    public void setSide(double side) {
        if(side >= 0) {
			this.width = side;
			this.length = side;
		} else {
			this.width = 0;
			this.length = 0;
		}
    }

    /**
     * @param side the width to set
     */
    public void setWidth(double side) {
        if(side >= 0) {
			this.width = side;
			this.length = side;
		}
    }

    /**
     * @param length the length to set
     */
    public void setLength(double side) {
        if(side >= 0) {
			this.width = side;
			this.length = side;
		}
    }

	/**
     * @return Area
     */
    public double getArea() {
		return this.width * this.width;
        // return Math.round(this.width * this.width * 100.0) / 100.0;
    }

    /**
     * @return Perimeter
     */
    public double getPerimeter() {
		return 4.0 * this.width;
        // return Math.round(4.0 * this.width * 100.0) / 100.0;
    }
	
    public String toString() {
        return "Square[side=" + this.width + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

}
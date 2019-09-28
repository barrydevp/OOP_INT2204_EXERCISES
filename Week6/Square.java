public class Square extends Rectangle {
    protected double width;
    protected double length;

    public Square() {
        super();
        this.width = 0;
        this.length = 0;
    }

    public Square(double side) {
        super();
        this.width = side;
        this.length = side;
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
        this.width = side;
        this.length = side;
    }

    /**
     * @param side the width to set
     */
    public void setWidth(double side) {
        this.width = side;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return "Square[" + super.toString() + ",side=" + this.width + "]";
    }

}
public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * 
     * @param other
     * @return distance of two point
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }

    /**
     * 
     * @param obj
     * @return true if two point has the same coordinate X and Y
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {

            Point other = (Point) obj;
            
            // compare this vs other here
            if(Math.abs(this.x - other.x) > 0.001) return false;
            if(Math.abs(this.y - other.y) > 0.001) return false;

            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int prime = 5;
        int result = 1;
        result = prime * result + Double.valueOf(this.x).hashCode();
        return result * prime + Double.valueOf(this.y).hashCode(); 
    }

    /**
     * 
     * @return String of point Object
     */
    public String toString() {
        
        return "(" + this.x + "," + this.y + ")";
    }

}
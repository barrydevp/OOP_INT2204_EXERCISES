import java.util.*;
import java.util.stream.*;

public class Layer {
    private LinkedList<Shape> shapes;

    public Layer() {
        this.shapes = new LinkedList<Shape>();
    }

    /**
     * 
     * @param shape
     */
    void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * 
     * @return
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";

        Iterator<Shape> i = this.shapes.iterator();
        while (i.hasNext()) {
            info += i.next().toString() + "\n";
        }

        return info;
    }
    
    /**
     * 
     */
    public void removeCircles() {
        Iterator<Shape> i = this.shapes.iterator();

        // int index = 0;
        while (i.hasNext()) {
            Shape shape = i.next();
            // System.out.println(shape.toString());
            // System.out.println(shape instanceof Circle);
            // this.shapes.remove();
            if(shape instanceof Circle) {
                // this.shapes.remove();
                i.remove();
            }
            // index++;
        }
    }

    public void removeDuplicates() {
        this.shapes = this.shapes.stream().distinct().collect(Collectors.toCollection(LinkedList<Shape>::new));
        // this.shapes = this.shapes.stream().peek(System.out::println).filter(o -> o instanceof Rectangle).distinct().peek(System.out::println).collect(Collectors.toCollection(LinkedList<Shape>::new));
    }
}
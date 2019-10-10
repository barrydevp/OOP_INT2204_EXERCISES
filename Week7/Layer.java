import java.util.*;
import java.util.stream.*;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        this.shapes = new ArrayList<Shape>();
    }

    /**
     * 
     * @param shape
     */
    public void addShape(Shape shape) {
        if(shape != null)
            this.shapes.add(shape);
    }

    /**
     * 
     * @return
     */
    public String getInfo() {
        String info = "Layer of crazy shapes: \n";

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
        // Iterator<Shape> i = this.shapes.iterator();

        // while (i.hasNext()) {
        //     Shape shape = i.next();
        //     if(shape instanceof Circle) {
        //         i.remove();
        //     }
        // }
        for(int i = 0; i < this.shapes.size(); ++i) {
            if(this.shapes.get(i) instanceof Circle) {
                this.shapes.remove(i);
            }
        }
    }

    public void removeDuplicates() {
        this.shapes = this.shapes.stream().distinct().collect(Collectors.toCollection(ArrayList<Shape>::new));
        // this.shapes = this.shapes.stream().peek(System.out::println).filter(o -> o instanceof Rectangle).distinct().peek(System.out::println).collect(Collectors.toCollection(LinkedList<Shape>::new));
    }
}
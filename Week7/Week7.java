import java.util.*;
import java.util.stream.*;

public class Week7 {
    public static void main(String[] args) {
        // Circle c = new Circle();
        // Circle c1 = new Circle(2.0);
        // Circle c2 = new Circle(4.2, "Red", true);
    
        // System.out.println(c.toString());
        // System.out.println(c1.getArea());
        // System.out.println(c1.getPerimeter());
        // System.out.println(c2.toString());

        // Rectangle r = new Rectangle();
        // Rectangle r1 = new Rectangle(2.0, 3.0);
        // Rectangle r2 = new Rectangle(4.2, 2.0, "Red", true);
    
        // System.out.println(r.toString());
        // System.out.println(r1.getArea());
        // System.out.println(r1.getPerimeter());
        // System.out.println(r2.toString());

        // Square s = new Square();
        // Square s1 = new Square(2.0);
        // Square s2 = new Square(4.2, "Red", true);
    
        // System.out.println(s.toString());
        // System.out.println(s1.getArea());
        // System.out.println(s1.getPerimeter());
        // System.out.println(s2.toString());

        // // up casting
        // Shape sh = new Circle(2.0, "RED", true);
        // Shape sh1 = new Rectangle(2.0, 3.0, "RED", true);
        // Shape sh2 = new Square(2.0, "RED", true);

        // System.out.println(sh.toString());
        // System.out.println(sh1.toString());
        // System.out.println(sh2.toString());
        // // down casting
        // Square c3 = (Square)sh2;
        
        // System.out.println(c3);

        // Shape s4 = new Square(new Point(2.0, 3.0), 6.6, "RED", true);
        // Shape s2 = new Square(new Point(2.0, 3.0), 6.6, "RED", true);
        // Shape s3 = new Rectangle(new Point(2.0, 3.0), 6.6, 6.2, "WHITE", true);
        // // Square s5 = (Square)s3;
        
        // // System.out.println(s3 instanceof Square);
        // System.out.println(s4.equals(s2));
        // System.out.println(s2.hashCode());
        // System.out.println(s4.hashCode());
        // System.out.println(s3.hashCode());
        Layer layer = new Layer();
        layer.addShape(new Square(new Point(2.0, 3.0), 6.6, "RED", true));
        layer.addShape(new Rectangle(new Point(2.0, 3.0), 6.6, 6.6, "WHITE", true));
        layer.addShape(new Rectangle(new Point(2.0, 3.0), 6.6, 6.6, "WHITE", true));
        layer.addShape(new Rectangle(new Point(2.0, 3.0), 6.6, 6.6, "WHITE", true));
        layer.addShape(new Circle(new Point(1.0, 3.0), 2.0, "WHITE", true));
        layer.addShape(new Circle(new Point(1.0, 3.0), 2.0, "WHITE", true));
        layer.addShape(new Circle(new Point(1.0, 3.0), 2.0, "WHITE", true));
        layer.addShape(new Rectangle(new Point(4.0, 1.0), 3, 4.6, "WHITE", true));
        layer.addShape(new Rectangle(new Point(4.0, 1.0), 3, 4.6, "WHITE", true));
        layer.addShape(new Rectangle(new Point(4.0, 1.0), 3, 4.6, "WHITE", true));
        layer.addShape(new Circle(new Point(2.0, 2.0), 4.0, "WHITE", true));
        layer.addShape(new Circle(new Point(2.0, 2.0), 4.0, "WHITE", true));
        layer.addShape(new Circle(new Point(2.0, 5.0), 6.0, "WHITE", true));

        // System.out.println(layer.getInfo());
        // layer.removeCircles();
        // System.out.println(layer.getInfo());
        layer.removeDuplicates();
        System.out.println(layer.getInfo());
    }
}
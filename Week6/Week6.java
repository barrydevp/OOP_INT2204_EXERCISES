public class Week6 {
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

        Shape s4 = new Square(6.6);
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
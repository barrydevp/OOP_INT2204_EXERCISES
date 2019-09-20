public class Week5 {
  public static void main(String[] args) {
    Circle cir = new Circle(2.0, "blue");

    System.out.println(cir.getArea());
    System.out.println(cir.getColor());
    System.out.println(cir.toString());

    Cylinder cyl = new Cylinder(2.0, 4.0, "yellow");
    System.out.println(cyl.getArea());
    System.out.println(cyl.getVolume());
    System.out.println(cyl.getColor());
    System.out.println(cyl.toString());
  }
}
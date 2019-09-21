public class Week5 {
  public static void main(String[] args) {
    // Circle cir = new Circle(2.0, "blue");

    // System.out.println(cir.getArea());
    // System.out.println(cir.getColor());
    // System.out.println(cir.toString());

    // Cylinder cyl = new Cylinder(2.0, 4.0, "yellow");
    // System.out.println(cyl.getArea());
    // System.out.println(cyl.getVolume());
    // System.out.println(cyl.getColor());
    // System.out.println(cyl.toString());

    Person per = new Person();
    Person bar = new Person("Barry Allen", "USA");
    System.out.println(per.toString());
    System.out.println(bar.toString());

    Student stu = new Student();
    Student sBar = new Student("Barry Allen", "USA", "CS", 2015, 5.0);
    System.out.println(stu.toString());
    System.out.println(sBar.toString());

    Staff staff = new Staff();
    Staff staffBar = new Staff("Barry Allen", "USA", "Harvart", 6.0);
    System.out.println(staff.toString());
    System.out.println(staffBar.toString());
  }
}
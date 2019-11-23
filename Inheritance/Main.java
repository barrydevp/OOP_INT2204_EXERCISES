public class Main {
    public static void main(String[] args) {
        Haa haa = new Foo();
        Bar bar = new Foo();
        Foo foo = new Foo();
        haa.sayHello();
        bar.sayHello();
        foo.sayHello();
        // Bar bar1 = bar;
        // System.out.println(bar);
        // System.out.println(foo);
        // System.out.println(Bar.class);
    }
}
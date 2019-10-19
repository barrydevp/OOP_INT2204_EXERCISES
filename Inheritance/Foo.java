public class Foo extends Bar {
    // public Foo() {
    //     super();
    //     // sayHello();
    // }

    public Foo(String a) {
        // super(a);
        super.sayHello();
    }

    // public void sayHello() {
    //     System.out.println("Hello Foo");
    // }
}

class Bar extends Haa {
    // public Bar() {
    //     sayHello();
    // }

    // public Bar(String test) {
    //     System.out.println(test);
    // }

    // public void sayHello() {
    //     System.out.println("Hello Bar");
    // }
}

class Haa {
    public Haa() {
        sayHello();
    }

    public void sayHello() {
        System.out.println("Hello Haa");
    }
}
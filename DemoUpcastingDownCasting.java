class A {
    public void show1() {
        System.err.println("in A Show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B Show");

    }
}

public class DemoUpcastingDownCasting {
    public static void main(String a[]) {
        A obj = new B();                               // A obj = (A)new B(); Upcasting
        obj.show1();

        B obj1 = (B)obj                  // simply write B obj1 = new B() // called DownCasting
        obj1.show2();
    }
}

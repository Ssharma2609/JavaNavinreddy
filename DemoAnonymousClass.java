class A {
    public void show() {
        System.out.println("in A Show ");
    }
}

public class DemoAnonymousClass {
    public static void main(String[] args) {
        A obj = new A() { // anonymous inner class declaration
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

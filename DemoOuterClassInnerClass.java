class OuterClass {
    private String outerField = "Outer field";

    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
}

public class DemoOuterClassInnerClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // inner class object declaration
        inner.display();
    }
}

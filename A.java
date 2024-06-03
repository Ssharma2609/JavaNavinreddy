//abstract and anonymous class in one class.....

abstract class A {
    public abstract void show();

    public static void main(String[] args) {
        A obj = new A() { // anonymous class ....here a obj=new A() is object creation of anonymous class
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

class MathOperation {

    public int add(int a, int b) // Overloaded methods
    {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class DemoMaths {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        System.out.println(operation.add(5, 3));
        System.out.println(operation.add(5.0, 3.0));
    }
}

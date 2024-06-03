class Computer {
    public void show() {
        System.out.println("in Computer");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("in Laptop");
    }
}

public class DemoAnimal {
    public static void main(String a[]) {
        Computer lap = new Laptop(); // creating a object of laptop but the type of obj(reference variable) is
                                     // Computer and it only happens when laptop is a subclass of computer.
        lap.show();

        lap = new Computer();
        lap.show();
    }
}

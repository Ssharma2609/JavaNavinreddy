class Animal {
    public void makeSound1() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound2() {
        System.out.println("Dog barks");
    }
}

public class DemoUpcastingDowncasting2 {
    public static void main(String[] args) {

        Animal obj = new Dog(); // upcasting
        Dog obj1 = (Dog) obj; // Downcasting

        obj.makeSound1();
        obj1.makeSound2();
    }
}

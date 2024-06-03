abstract class Car { // abstract class
    public abstract void drive(); // abstract method

    public abstract void fly(); // abstract method

    public void playMusic() {
        System.out.println("music playing");
    }
}

abstract class WagonR extends Car {
    public void drive() { // abstract method declaration
        System.out.println("Driving..");
    }

}

class UpdatedWagonR extends WagonR // concrete class
{
    public void fly() { // abstract method declaration
        System.out.println("Flying");
    }
}

public class DemoAbstract {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR(); // upcasting ,,concrete class can only create object not abstract class
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}

class Animal 
{
    public void sound()
     {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
 {
    
     public void sound()       //  Override
     {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
 {
   
    public void sound()       //Override
    {
        System.out.println("Cat meows");
    }
}

public class Main 
{
    public static void main(String[] args)
     {
        // Animal myDog = new Dog();      //
        // Animal myCat = new Cat();
      
        // Dog myDog = new Dog();
        // Cat myCat = new Cat();
        
        Animal ani = new Dog();              //Dynamic Method Dispatch;
        ani.sound();

        ani = new Cat();
        ani.sound();




        // myDog.sound();   
        // myCat.sound();
    }
}

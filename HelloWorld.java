class HelloWorld
 {
    public void printMessage()
     {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) 
    {

        new HelloWorld().printMessage();           // Creating an anonymous object to call the printMessage method
    }
}

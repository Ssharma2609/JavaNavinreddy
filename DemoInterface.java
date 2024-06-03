interface A                     //interface only declare the method not its implementation
{
     int age=28;
     String area = "Bengaluru";       //variables in interface are by default final and static

    void show();                //no need to specify abstract bcoz (;) means by default it public abstract
    void config();
}
interface X
{
    void run();
}
// interface Y extends X                  //extends keyword is used to implement from one interface to another and interface don't implement abstract method so the body is blank
// {
  
// }
 class B implements A,X                 // implements keywords is used to extends the interface in another class
{
     public void show()
    {
       System.out.println("in show");

    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("Running..");
    }
}
public class DemoInterface
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
        System.out.println(A.age);      //since variable are static we call it by using interface name itself because we can't create the object of interface
        System.out.println(A.area);
    }
}
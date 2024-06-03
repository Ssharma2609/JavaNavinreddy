class Mobile
{
    String brand;
    int price;
    static String name;
     
    static                                                             //static block    
    {
        name = "Phone";
        System.out.println("in static block"); 
    }
    public Mobile()                                            //constructor
    {
        brand ="";
        price = 200;
        System.out.println("in constructor");

    }
    public void show()
    {
        System.out.println(brand+ " : " +price+ " : " +name);
    }
}

public class DemoMobile
 {
     public static void main(String[] args) 
     {
       Mobile obj = new Mobile();
       obj.brand = "Apple";
       obj.price = 1500;
       Mobile.name = "Smartphone";               //static variable should be called by class name itself not by object name 
       

       obj.show();         


       Mobile obj1 = new Mobile();
       obj1.brand = "Samsung";
       obj1.price = 2500;
       Mobile.name = "Android";
       obj1.show();

    
    
    
    
    }

 }  












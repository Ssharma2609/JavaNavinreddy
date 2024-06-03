
class Human {
    private int age;
    private String name; // age and name here are instance variable

    public int getAge() {
        return age;
    }

    public void setAge(int age) // here age in as parameter are called local varaiable
    {
        this.age = age; // this here refers to the current class.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class DemoGetterSetter {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Sunakshi");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}

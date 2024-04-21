public class Dog implements Animal{
    String name;//instance variable

    //Custom constructor
    Dog(String name){

        this.name=name;//sets the value of the instance variable of the base class
    }

    //Implementation of the abstract methods coming from interface
    public void walk() {

        System.out.println(name + " is walking.");
    }

    public void eat() {

        System.out.println(name + " is eating.");
    }
}

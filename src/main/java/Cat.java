public class Cat implements Animal{

    String name;//instance variable

    //Custom constructor
    Cat(String name){

        this.name=name;//sets the value of the instance variable
    }

    //Implementation of the abstract methods coming from the interface
    public void walk() {

        System.out.println(name + " is walking.");
    }

    public void eat() {

        System.out.println(name + " is eating.");
    }
}

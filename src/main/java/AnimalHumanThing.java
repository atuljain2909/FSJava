public class AnimalHumanThing implements Animal, Human{

    String name;//instance variable

    //Custom constructor
    AnimalHumanThing(String name){

        this.name=name;//sets the value of the instance variable of the base class
    }

    public void eat() {
        System.out.println(name + " is eating (implementing Animal)");
    }

    public void walk() {
        System.out.println(name + " is walking (implementing Animal)");
    }

    public void eatsMeals() {
        System.out.println(name + " is eating meals (implementing Human)");
    }

    public void walksAndDrives() {
        System.out.println(name + " is walking and driving (implementing Human)");
    }

    //Since this class is implementing both Animal and Human interfaces which have a common default method named 'sleep'
    //So, we will have to override the same method here. Now, it is upto a class to decide whether it wants to have its own custom definition of the same method or can call any one of the interface's method definition
    public void sleep() {
        //Its own custom definition
        System.out.println("AnimalHumanThing is sleeping");
        //Can call the implementation of Animal interface
        Animal.super.sleep();
        //Can call the implementation of Human interface
        Human.super.sleep();
    }
}

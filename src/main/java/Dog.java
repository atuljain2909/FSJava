public class Dog extends Animal{
    String name;//instance variable of base class with the same name as that in super class

    //Custom constructor of base class (there was a compulsion to make this as the super class had a custom constructor)
    Dog(String name){

        super(name);//calls the custom constructor of the super class
        this.name=name;//sets the value of the instance variable of the base class
    }

    //Implementation of the abstract method coming from the super class
    public void walk() {

        //Since this is a local method, so it's using local variable 'name' and not the instance variable of the super class.
        System.out.println(name + " is walking.");
    }
}

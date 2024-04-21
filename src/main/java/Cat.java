public class Cat extends Animal{

    //Custom constructor of base class (there was a compulsion to make this as the super class had a custom constructor)
    Cat(String name){

        super(name);//calls the custom constructor of the super class
    }

    //Implementation of the abstract method coming from the super class
    public void walk() {

        //It's using the instance variable of the super class and not the local variable 'name', which has already been set in the constructor of this class.
        System.out.println(name + " is walking.");
    }
}

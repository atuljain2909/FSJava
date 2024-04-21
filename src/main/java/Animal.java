public abstract class Animal {
    String name;//instance variable of super class

    //Custom constructor of super class
    Animal(String name){
        this.name=name;
    }

    //Non-abstract method of super class
    void eat(){
        System.out.println(name + " is eating.");
    }

    //Abstract method of super class
    abstract void walk();
}

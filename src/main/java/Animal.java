public interface Animal {

    //Any method inside an interface are by default abstract and public
    void eat();

    void walk();

    //Default method of an interface
    default void sleep(){
        System.out.println("Animal is sleeping.");
    }

    //Static method of an interface
    static void prey(){
        System.out.println("Animal preys to eat food. This is specific to animals and can't be overridden.");
    }
}

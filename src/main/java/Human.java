public interface Human {

    void eatsMeals();

    void walksAndDrives();

    //Default method of an interface
    default void sleep(){
        System.out.println("Human is sleeping.");
    }

    //Static method of an interface
    static void study(){
        System.out.println("Human is studying Java. This is specific to humans and can't be overridden.");
    }
}

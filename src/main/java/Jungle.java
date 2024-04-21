public class Jungle {

    public static void main(String[] args) {

        //Since an interface can't be instantiated (you can't make an object of an interface)
        //therefore, you will have to make an object of the class implementing that interface and assign it to variable of the interface (up-casting)
        Animal dog = new Dog("Shadow");
        dog.walk();
        dog.eat();

        Animal cat = new Cat("Terra");
        cat.walk();
        cat.eat();

        //Here, we are directly making an object of the class implementing the interface, so even though this results in the same method being invoked as above case
        //However, if you do a Ctrl+click on the walk method, this way would take you to the class level implementation, thus revealing all the details.
        //In above case, if you do the same thing, it takes you to abstract method of the interface, where details are hidden; thus, maintaining the confidentiality.
        Dog d = new Dog("New shadow");
        d.walk();
        d.eat();
        Cat c = new Cat("New Terra");
        c.walk();
        c.eat();

       Animal a = new AnimalHumanThing("Animal");
       a.eat();
       a.walk();
       //a.sleep();//Illegal; compiler gets confused which sleep method to call, i.e. from Animal or Human. In fact, a class can't implement two or more interfaces which have a common default method, unless it overrides them
       a.sleep();//Calls the overridden definition of sleep method
       Animal.prey();//Calling static method of interface directly by the name of interface and dot operator

       Human h = new AnimalHumanThing("Human");
       h.eatsMeals();
       h.walksAndDrives();
       //h.sleep();//Illegal; compiler gets confused which sleep method to call, i.e. from Animal or Human
       h.sleep();//Calls the overridden definition of sleep method
       Human.study();//Calling static method of interface directly by the name of interface and dot operator
    }
}

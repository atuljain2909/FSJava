public class Jungle {

    public static void main(String[] args) {

        //Since abstract class can't be instantiated (you can't make an object of the abstract class)
        //therefore, you will have to make an object of the base class and assign it to variable of the super class (up-casting)
        Animal dog = new Dog("Shadow");
        Animal cat = new Cat("Terra");
        dog.walk();
        cat.walk();
        dog.eat();//calling non-abstract methods of the super class where implementation details can be seen
        cat.eat();//that's why we say abstract classes help us achieve partial abstraction.

        //Here, we are making an object of the base class itself, so even though this results in the same method being invoked as above case
        //However, if you do a Ctrl+click on the walk method, this way would take you to the base class implementation, thus revealing all the details.
        //In above case, if you do the same thing, it takes you to abstract method of the super class, where details are hidden; thus, maintaining the confidentiality.
        Dog d = new Dog("New shadow");
        d.walk();
        d.eat();
        Cat c = new Cat("New Terra");
        c.walk();
        c.eat();
    }
}

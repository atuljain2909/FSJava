package in.podtest.part.second.package1;

// Question #7
public class Human {

    //Same package, different class, ND -> can't access any variable
    void methodToAccessVariablesWithoutDotOperator(){
        //The following statements are illegal.
        /*
        name="same package different class.ND";
        age=1;
        gender="male";
        id=101;
        */
    }

    //Same package, different class, D -> can access all variables except the private one
    void methodToAccessVariablesWithDotOperator(){
        Animal a = new Animal();
        a.name="same package different class.D";
        //a.age=2;//private variable can't be accessed
        a.gender="male";
        a.id=103;
    }
}

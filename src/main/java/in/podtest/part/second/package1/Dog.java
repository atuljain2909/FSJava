package in.podtest.part.second.package1;

// Question #7
public class Dog extends Animal{
    //Same package, child class, ND -> can access all variables except the private one
    void childMethodToAccessVariablesWithoutDotOperator(){
        name="same package child class.ND";
        //age=4;//private variable can't be accessed
        gender="child.male";
        id=101;

    }

    //Same package, child class, D -> can access all variables except the private one
    void childMethodToAccessVariablesWithDotOperator(){
        Animal a = new Animal();
        a.name="same package child class.DD";
        //a.age=5;//private variable can't be accessed
        a.gender="child.female";
        a.id=103;
    }
}

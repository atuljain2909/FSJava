package in.podtest.part.second.package2;

import in.podtest.part.second.package1.Animal;

public class Lion extends Animal {
    //Different package, child class, ND -> can access only public and protected variables
    void diffPkgMethodToAccessVariablesWithoutDotOperator(){
        name="different package child class.ND";
        //age=4;//private variable can't be accessed
        gender="child.male";
        //id=101;//default access variable can't be accessed

    }

    //Different package, child class, D -> can access only public and protected variables, but its not allowing me to access the protected variable
    void diffPkgMethodToAccessVariablesWithDotOperator(){
        Animal a = new Animal();
        a.name="different package child class.D";
        //a.age=5;//private variable can't be accessed
        //a.gender="female";//DID NOT ALLOW
        //a.id=103;//default access variable can't be accessed
    }
}

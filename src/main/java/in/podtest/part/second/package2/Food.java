package in.podtest.part.second.package2;

import in.podtest.part.second.package1.Animal;

public class Food {
    //Different package, different class, ND -> can't access any variable
    void diffPkgMethodToAccessVariablesWithoutDotOperator(){
        //The following statements are illegal
        /*
        name="different package different class.ND";
        age=4;
        gender="male";
        id=101;
        */
    }

    //Different package, child class, D -> can access only public variables
    void diffPkgMethodToAccessVariablesWithDotOperator(){
        Animal a = new Animal();
        a.name="different package different class.D";
        //a.age=5;//private variable can't be accessed
        //a.gender="female";//protected variable can't be accessed
        //a.id=103;//default access variable can't be accessed
    }
}

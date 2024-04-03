//import package1.DefaultClassP1;
import package1.PublicClassP1;

public class CallingClassOutsideAnyPackage {

    // Class with "public" access modifier can be accessed anywhere
    PublicClassP1 pcp2 = new PublicClassP1();
    // Because we are trying to access a class with "default" access modifier outside its package, that's why the following is not allowed
//    DefaultClassP1 dcp2 = new DefaultClassP1();

    public static void main(String[] args) {

        CallingClassOutsideAnyPackage c = new CallingClassOutsideAnyPackage();
        c.callingMethod();
    }
    public void callingMethod(){

        // Because we are trying to access methods and variables with "default" access modifier outside the package of their class, that's why the following is not allowed
//        pcp2.defaultMethodPublicClassP1();
//        System.out.println(pcp2.defaultVariablePublicClassP1);

        // Because we are trying to access methods and variables with "default" access modifier outside the package of their class, that's why the following is not allowed
//        pcp2.protectedMethodPublicClassP1();
//        System.out.println(pcp2.protectedVariablePublicClassP1);

        // Variables and methods with "public" access modifier are accessible everywhere
        pcp2.publicMethodPublicClassP1();
        System.out.println(pcp2.publicVariablePublicClassP1);

        /*
        Variables and methods with "private" access modifier are accessible only within the same class, thus the following is not allowed
        pcp1.privateMethodPublicClassP1();
        System.out.println(pcp1.privateVariablePublicClassP1);
        */
    }

}

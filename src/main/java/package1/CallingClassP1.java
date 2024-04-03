package package1;

public class CallingClassP1 {

    // Class with "public" access modifier can be accessed anywhere
    PublicClassP1 pcp1 = new PublicClassP1();
    // Class with "default" access modifier can be accessed within the same package
    DefaultClassP1 dcp1 = new DefaultClassP1();

    public static void main(String[] args) {
        CallingClassP1 ccp1 = new CallingClassP1();
        ccp1.callingMethod();
    }

    public void callingMethod(){

        // Variables and methods with "default" access modifier are accessible here as we are referring to them within the same package
        pcp1.defaultMethodPublicClassP1();
        System.out.println(pcp1.defaultVariablePublicClassP1);

        // Variables and methods with "protected" access modifier are accessible here as we are referring to them within the same package
        pcp1.protectedMethodPublicClassP1();
        System.out.println(pcp1.protectedVariablePublicClassP1);

        // Variables and methods with "public" access modifier are accessible everywhere
        pcp1.publicMethodPublicClassP1();
        System.out.println(pcp1.publicVariablePublicClassP1);

        /*
        Variables and methods with "private" access modifier are accessible only within the same class, thus the following is not allowed
        pcp1.privateMethodPublicClassP1();
        System.out.println(pcp1.privateVariablePublicClassP1);
        */

        // Variables and methods with "public" access modifier are accessible everywhere
        dcp1.publicMethodDefaultClassP1();
        System.out.println(dcp1.publicVariableDefaultClassP1);

        // Variables and methods with "protected" access modifier are accessible here as we are referring to them within the same package
        dcp1.protectedMethodDefaultClassP1();
        System.out.println(dcp1.protectedVariableDefaultClassP1);

        // Variables and methods with "default" access modifier are accessible here as we are referring to them within the same package
        dcp1.defaultMethodDefaultClassP1();
        System.out.println(dcp1.defaultVariableDefaultClassP1);

        /*
        Variables and methods with "private" access modifier are accessible only within the same class, thus the following is not allowed
        dcp1.privateMethodPublicClassP1();
        System.out.println(dcp1.privateVariablePublicClassP1);
        */
    }
}

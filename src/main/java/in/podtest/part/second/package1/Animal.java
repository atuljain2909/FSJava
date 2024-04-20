package in.podtest.part.second.package1;

public class Animal {
    public String name;
    private int age;
    protected String gender;
    int id;//default access modifier

    //Same package, same class, ND -> can access all variables
    void methodToAccessVariablesWithoutDotOperator(){
        name="same class.ND";
        age=1;
        gender="male";
        id=101;
    }

    //Same package, same class, D -> can access all variables
    void methodToAccessVariablesWithDotOperator(){
        Animal a = new Animal();
        a.name="same class.D";
        a.age=2;
        a.gender="female";
        a.id=102;
    }
}

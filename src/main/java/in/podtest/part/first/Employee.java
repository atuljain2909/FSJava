package in.podtest.part.first;

// Question #1: creation of classes
public class Employee {

    final String name;
    final int age;
    private final float monthlySalary;
    final int empID;
    boolean isActive;

    Employee(String name, int age, float monthlySalary, int empID, boolean isActive){
        this.name=name;
        this.age=age;
        this.monthlySalary=monthlySalary;
        this.empID=empID;
        this.isActive=isActive;
    }

    // Question #4.2
    void getDetails(){
        System.out.println("--------------------------------");//extra line to make demarcation in the console output to be make it more readable, purely optional though!
        System.out.println("Employee's name is: " + this.name);
        System.out.println("Employee's age is: " + this.age);
        System.out.println("Employee's emp ID is: " + this.empID);
        System.out.println("Employee's employment status is: " + (this.isActive?"Active":"Inactive"));
    }

    // Question #4.2
    float getTaxAmountToBePaid(){
        float tax;
        if (this.monthlySalary>100000.00f)
            tax=(float)0.2*this.monthlySalary;
        else
            tax=0.00f;
        return tax;
    }

    // Question #4.3
    // Had to create a public method which can be used to fetch monthly salary (since the variable in itself if private).
    // This method is then called inside Admin->getTotalRequiredBudget() method to compute the total budget.
    public float getEmployeeSalary(){
        return this.monthlySalary;
    }
}

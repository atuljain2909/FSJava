public class Employee {
    private String empID;
    private String name;
    private int salary;

    public Employee(String empID, String name, int salary){
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }

    public String getEmployeeName(){
        return name;
    }

    public String getEmployeeID(){
        return empID;
    }

    public int getEmployeeSalary(){
        return salary;
    }
}

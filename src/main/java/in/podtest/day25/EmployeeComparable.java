package in.podtest.day25;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    String name;
    Integer empID;

    public EmployeeComparable(String name, Integer empID){
        this.name=name;
        this.empID=empID;
    }

    public int compareTo(EmployeeComparable employee) {
        return this.name.compareTo(employee.name);
    }
}

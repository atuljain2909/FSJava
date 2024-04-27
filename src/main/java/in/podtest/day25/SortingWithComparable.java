package in.podtest.day25;
import java.util.*;

public class SortingWithComparable {

    public static void main(String[] args) {

        EmployeeComparable e1 = new EmployeeComparable("Madhukar", 35);
        EmployeeComparable e2 = new EmployeeComparable("Sudhakar", 23);
        EmployeeComparable e3 = new EmployeeComparable("Fijula", 57);
        EmployeeComparable e4 = new EmployeeComparable("Rafelia", 5);

        List<EmployeeComparable> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Collections.sort(employees);

        Iterator<EmployeeComparable> i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparable e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }
    }
}

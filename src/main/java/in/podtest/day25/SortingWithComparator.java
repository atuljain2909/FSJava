package in.podtest.day25;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingWithComparator {

    public static void main(String[] args) {

        EmployeeComparator e1 = new EmployeeComparator("Madhukar", 35);
        EmployeeComparator e2 = new EmployeeComparator("Sudhakar", 23);
        EmployeeComparator e3 = new EmployeeComparator("Fijula", 57);
        EmployeeComparator e4 = new EmployeeComparator("Rafelia", 5);
        EmployeeComparator e5 = new EmployeeComparator("Atul", 101);

        List<EmployeeComparator> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("BEFORE SORTING WAS APPLIED");
        Iterator<EmployeeComparator> i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparator e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }

        Collections.sort(employees, new SortByNameAscendingUsingComparator());
        System.out.println("SORTING BY NAME IN ASCENDING ORDER");
        i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparator e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }

        Collections.sort(employees, new SortByNameDescendingUsingComparator());
        System.out.println("SORTING BY NAME IN DESCENDING ORDER");
        i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparator e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }

        Collections.sort(employees, new SortByEmpIDAscendingUsingComparator());
        System.out.println("SORTING BY EMP ID IN ASCENDING ORDER");
        i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparator e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }

        Collections.sort(employees, new SortByEmpIDDescendingUsingComparator());
        System.out.println("SORTING BY EMP ID IN DESCENDING ORDER");
        i = employees.iterator();
        while (i.hasNext()){
            EmployeeComparator e = i.next();
            System.out.println(e.name+ " | "+e.empID);
        }
    }
}

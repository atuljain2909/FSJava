package in.podtest.day25;

import java.util.Comparator;

public class SortByEmpIDDescendingUsingComparator implements Comparator<EmployeeComparator> {

    public int compare(EmployeeComparator e1, EmployeeComparator e2) {
        return e2.empID.compareTo(e1.empID);
    }
}

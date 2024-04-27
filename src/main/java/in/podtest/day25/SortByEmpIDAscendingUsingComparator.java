package in.podtest.day25;

import java.util.Comparator;

public class SortByEmpIDAscendingUsingComparator implements Comparator<EmployeeComparator> {

    public int compare(EmployeeComparator e1, EmployeeComparator e2) {
        return e1.empID.compareTo(e2.empID);
    }
}

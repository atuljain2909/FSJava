package in.podtest.day25;

import java.util.Comparator;

public class SortByNameAscendingUsingComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator e1, EmployeeComparator e2) {
        return e1.name.compareTo(e2.name);
    }
}

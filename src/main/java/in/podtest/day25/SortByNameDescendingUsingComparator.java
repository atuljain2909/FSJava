package in.podtest.day25;

import java.util.Comparator;

public class SortByNameDescendingUsingComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator e1, EmployeeComparator e2) {
        return e2.name.compareTo(e1.name);
    }
}

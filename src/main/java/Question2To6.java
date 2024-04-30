import java.util.*;

public class Question2To6 {
    public static void main(String[] args) {

        //Question #2
        //Approach Used: Make an instance of Employee class to represent each employee.
        //And then make a map with EmpID as key and these instances of Employee class as value to those keys.
        //We will, then, fetch list of values from the map to print the table.

        Employee e1 = new Employee("T1","Suraj", 97);
        Employee e2 = new Employee("T2","Zen", 103);
        Employee e3 = new Employee("T3","Derrick", 72);
        Employee e4 = new Employee("T4","Piyush", 108);
        Employee e5 = new Employee("T5","Zen", 54);

        Map<String,Employee> mapWithClass = new HashMap<>();
        mapWithClass.put("T1", e1);
        mapWithClass.put("T2", e2);
        mapWithClass.put("T3", e3);
        mapWithClass.put("T4", e4);
        mapWithClass.put("T5", e5);

        System.out.println("EmpID | Name | Salary");
        for (Map.Entry<String,Employee> entry:mapWithClass.entrySet()){
            System.out.println(entry.getKey()
                    +" | " + entry.getValue().getEmployeeName()
                    + " | " + entry.getValue().getEmployeeSalary());
        }
        System.out.println("------------------------------------------");

        //Question #3: Sort the table by name in ascending order.
        //Approach Used: Make a temporary list of employee class and perform sorting on it.
        //Thereafter, print the table using this temporary list (downside: the original map still remains unsorted).
        List<Employee> tempEmployeeList = new ArrayList<>(mapWithClass.values());
        Collections.sort(tempEmployeeList, new Comparator<Employee>(){
            public int compare(Employee e1, Employee e2) {
                return e1.getEmployeeName().compareTo(e2.getEmployeeName());
            }
        }
        );
        System.out.println("Sorted the table by name in ascending order.");
        System.out.println("EmpID | Name | Salary");
        for (Employee e: tempEmployeeList){
            System.out.println(e.getEmployeeID()
                    +" | " + e.getEmployeeName()
                    +" | " + e.getEmployeeSalary());
        }
        System.out.println("------------------------------------------");

        //Question #4: Sort the table by salary in ascending order.
        //Approach Used: Use the temporary list created above and perform sorting on it.
        //Thereafter, print the table using this temporary list (downside: the original map still remains unsorted).
        Collections.sort(tempEmployeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getEmployeeSalary(), e2.getEmployeeSalary());
            }
        });
        System.out.println("Sorted the table by salary in ascending order.");
        System.out.println("EmpID | Name | Salary");
        for (Employee e: tempEmployeeList){
            System.out.println(e.getEmployeeID()
                    +" | " + e.getEmployeeName()
                    +" | " + e.getEmployeeSalary());
        }
        System.out.println("------------------------------------------");

        //Question #5: Sort the table by name in descending order. If the names are same, sort by salary in ascending order.
        //Approach Used: Use the temporary list created above and perform sorting on it.
        //Thereafter, print the table using this temporary list (downside: the original map still remains unsorted).
        Collections.sort(tempEmployeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmployeeName().compareTo(e2.getEmployeeName())<0)
                    return 1;
                else if (e1.getEmployeeName().compareTo(e2.getEmployeeName())>0)
                    return -1;
                else
                    return Integer.compare(e1.getEmployeeSalary(), e2.getEmployeeSalary());
            }
        });
        System.out.println("Sorted the table by name in descending order. If the names were same, sorted by salary in ascending order.");
        System.out.println("EmpID | Name | Salary");
        for (Employee e: tempEmployeeList){
            System.out.println(e.getEmployeeID()
                    +" | " + e.getEmployeeName()
                    +" | " + e.getEmployeeSalary());
        }
        System.out.println("------------------------------------------");

        //Question #6: Print the row where name of the employee is "Suraj".
        //Approach Used: Retrieve the entry set of the map, so that you have access to both keys and values simultaneously.
        //Then, loop through the entry set and compare the value part. Where the comparison matches, print both key and value part.
        String valueToSearch="Suraj";
        System.out.println("Printing the data only for employee named: " + valueToSearch);
        System.out.println("EmpID | Name | Salary");
        for (Map.Entry<String,Employee> entry:mapWithClass.entrySet()){
            if (entry.getValue().getEmployeeName().equals(valueToSearch))
                System.out.println(entry.getKey()
                    + " | " + entry.getValue().getEmployeeName()
                    + " | " + entry.getValue().getEmployeeSalary());
        }
        System.out.println("------------------------------------------");
    }
}

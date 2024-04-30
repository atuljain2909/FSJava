import java.util.*;

public class Question1 {
    public static void main(String[] args) {

        //Question #1
        //Approach Used: Make EmpId as key of map and a list of name and salary as value to that key.
        //So, we will first make 5 lists, each pertaining to name and salary of these employees.
        //Then, we will create a map to feed in the empID (as key) and name and salary (as value).
        //We will then retrieve the set of keys to print the table.

        List<String> row1 = new ArrayList<>();
        row1.add("Suraj");row1.add("97");

        List<String> row2 = new ArrayList<>();
        row2.add("Zen");row2.add("103");

        List<String> row3 = new ArrayList<>();
        row3.add("Derrick");row3.add("72");

        List<String> row4 = new ArrayList<>();
        row4.add("Piyush");row4.add("108");

        List<String> row5 = new ArrayList<>();
        row5.add("Zen");row5.add("54");

        Map<String,List<String>> mapWithoutClass = new HashMap<>();
        mapWithoutClass.put("T1", row1);
        mapWithoutClass.put("T2", row2);
        mapWithoutClass.put("T3", row3);
        mapWithoutClass.put("T4", row4);
        mapWithoutClass.put("T5", row5);

        System.out.println("EmpID | Name | Salary");
        for (String k: mapWithoutClass.keySet()){
            System.out.println(k + " | " + mapWithoutClass.get(k).get(0) + " | " + mapWithoutClass.get(k).get(1));
        }
    }
}

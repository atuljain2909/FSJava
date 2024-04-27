package in.podtest.day24;
import java.util.*;

public class CollectionsComplexProblemApproachOne {

    public static void main(String[] args) {

        // Name   | Gender | Location
        // Akhil  | Male   | Ghaziabad
        // Ashok  | Male   | New York
        // Fijula | Female | Canada
        // Sayali | Female | UK

        List<String> row1 = new ArrayList<>();
        row1.add("Akhil");
        row1.add("Male");
        row1.add("Ghaziabad");

        List<String> row2 = new ArrayList<>();
        row2.add("Ashok");
        row2.add("Male");
        row2.add("New York");

        List<String> row3 = new ArrayList<>();
        row3.add("Fijula");
        row3.add("Female");
        row3.add("Canada");

        List<String> row4 = new ArrayList<>();
        row4.add("Sayali");
        row4.add("Female");
        row4.add("UK");

        List<List<String>> table = new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);

        System.out.println("Name | Gender | Location");

        //Iterate through table
        Iterator<List<String>> iterator = table.iterator();
        while (iterator.hasNext()){
            List<String> currentRow = iterator.next();
            System.out.println(currentRow.get(0)+" | "+currentRow.get(1)+" | "+currentRow.get(2));
        }
        System.out.println("-------------------------------------------");
    }
}

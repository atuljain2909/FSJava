package in.podtest.day24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsComplexProblemApproachTwo {

    public static void main(String[] args) {

        // Name   | Emp ID  | Gender
        // Akhil  | 1       | M
        // Ashok  | 2       | M
        // Fijula | 3       | F
        // Sayali | 4       | F

        IndividualRow row1 = new IndividualRow("Akhil", 1, 'M');
        IndividualRow row2 = new IndividualRow("Ashok", 2, 'M');
        IndividualRow row3 = new IndividualRow("Fijula", 3, 'F');
        IndividualRow row4 = new IndividualRow("Sayali", 4, 'F');

        List<IndividualRow> table = new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        table.add(row4);

        System.out.println("Name | Emp ID | Gender");

        //Iterate through table
        Iterator<IndividualRow> iterator = table.iterator();
        while (iterator.hasNext()){
            iterator.next().printRow();
        }
        System.out.println("-------------------------------------------");
    }

    public static class IndividualRow{

        String name;
        Integer empID;
        Character gender;

        public IndividualRow(String name, Integer empID, Character gender){
            this.name=name;
            this.empID=empID;
            this.gender=gender;
        }

        public void printRow(){
            System.out.println(this.name + " | "+this.empID+" | "+this.gender);
        }
    }
}

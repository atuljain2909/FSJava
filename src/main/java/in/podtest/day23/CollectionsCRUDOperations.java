package in.podtest.day23;
import java.util.*;

public class CollectionsCRUDOperations {

    public static void main(String[] args) {

        //Collections Declaration
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();

        //Storing data into collections
        set.add("Set_Value_1");
        set.add("Set_Value_2");
        set.add("Set_Value_3");
        list.add("List_Value_1");
        list.add("List_Value_2");
        list.add("List_Value_3");
        map.put(1, "Map_Value_1");//Autoboxing happening when you are providing int value as key here
        map.put(Integer.valueOf(2),"Map_Value_2");//we are explicitly doing boxing here
        map.put(3, "Map_Value_3");

        //Fetching size of collections
        System.out.println("Current size of set is: "+set.size());
        System.out.println("Current size of list is: "+list.size());
        System.out.println("Current size of map is: "+map.size());
        System.out.println("-------------------------------------------");

        //Fetching an object from collections
        //It is possible in list on the basis of index position, as list maintains indices
        System.out.println("Item in list at 0 index is: "+list.get(0));
        //System.out.println(list.get(3));//Will give IndexOutOfBoundsException
        //Sets, however, doesn't maintain indices. So they don't have get() method
        //Maps, however, allow retrieval based on keys
        System.out.println("Value in map associated with key=1 is: "+map.get(1));
        System.out.println(map.get(5));//fetching value against a key that doesn't exist returns null
        System.out.println("-------------------------------------------");

        //Deleting items from collections
        set.remove("Set_Value_1");
        set.remove("Atul");//Item doesn't exist, so no action
        list.remove("List_Value_1");//removal on basis of item
        list.remove(0);//removal on basis of index position//removes 'List_Value_2' this time
        list.remove("List_Value_1111");//Item doesn't exist, so no action
        map.remove(1);//removal on basis of key
        map.remove(2, "Map_Value_2");//removal on basis of exact key value pair
        map.remove(5);//Key doesn't exist, so no action
        map.remove(3, "333333");//Key value pair doesn't exist, so no action

        System.out.println("Current size of set is: "+set.size());
        System.out.println("Current size of list is: "+list.size());
        System.out.println("Current size of map is: "+map.size());
        System.out.println("-------------------------------------------");

        //Iterate through collections
        //First way for sets
        for (String s: set){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
        //Second way for sets
        Iterator<String> si = set.iterator();
        while (si.hasNext()){
            System.out.println(si.next());
        }
        System.out.println("-------------------------------------------");
        //First way for lists
        for (String s: list){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
        //Second way for lists
        for (int i=0; i<list.size();i++){
            System.out.println("Item at index:"+i+" is: "+list.get(i));
        }
        System.out.println("-------------------------------------------");
        //Third way for lists
        Iterator<String> li = list.iterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("-------------------------------------------");
        //First way for maps
        for (Integer ii:map.keySet()){
            System.out.println("Key="+ii+",Value="+map.get(ii));
        }
        System.out.println("-------------------------------------------");
        //Second way for maps
        for (Map.Entry<Integer,String> e:map.entrySet()){
            System.out.println(e);
        }
        System.out.println("-------------------------------------------");

        //Getting index position in list collection
        System.out.println("Index of item 'List_Value_3' is: "+list.indexOf("List_Value_3"));
        System.out.println("Index of item 'List_Value_3333' is: "+list.indexOf("List_Value_3333"));//returns -1 for something that doesn't exist
        System.out.println("-------------------------------------------");

        //Searching for an item in collection
        System.out.println(set.contains("Set_Value_3")?"Item 'Set_Value_3' is present in set":"Item 'Set_Value_3' is NOT present in set");
        System.out.println(set.contains("Set_Value_33")?"Item 'Set_Value_33' is present in set":"Item 'Set_Value_33' is NOT present in set");
        System.out.println(list.contains("List_Value_3")?"Item 'List_Value_3' is present in list":"Item 'List_Value_3' is NOT present in list");
        System.out.println(list.contains("List_Value_33")?"Item 'List_Value_33' is present in list":"Item 'List_Value_33' is NOT present in list");
        System.out.println(map.containsKey(3)?"Key '3' is present in map":"Key '3' is NOT present in map");
        System.out.println(map.containsValue("Map_Value_3")?"Value 'Map_Value_3' is present in map":"Value 'Map_Value_3' is NOT present in map");
        System.out.println(map.containsKey(33)?"Key '33' is present in map":"Key '33' is NOT present in map");
        System.out.println(map.containsValue("Map_Value_33")?"Value 'Map_Value_33' is present in map":"Value 'Map_Value_33' is NOT present in map");
        System.out.println("-------------------------------------------");

        //Update values in collections
        set.remove("Set_Value_3");
        set.add("New_Set_Value_3");
        list.remove("List_Value_3");
        list.add("New_List_Value_3");
        map.replace(3,"Map_Value_3","New_Map_Value_3");
        map.replace(3,"Newest_Map_Value_3");
        for (String s: set){
            System.out.println(s);
        }
        for (String s: list){
            System.out.println(s);
        }
        for (Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e);
        }
        System.out.println("-------------------------------------------");

        //Remove all items from collections
        set.clear();
        list.clear();
        map.clear();
        for (String s: set){
            System.out.println(s);
        }
        for (String s: list){
            System.out.println(s);
        }
        for (Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e);
        }
        System.out.println("-------------------------------------------");
    }
}

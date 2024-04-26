import java.util.*;

public class CollectionsIntro {

    public static void main(String[] args) {

        CollectionsIntro ci = new CollectionsIntro();
        ci.hashSetWithoutDataTypeDemo();
        ci.hastSetWithDataTypeDemo();
        ci.arrayListWithoutDataTypeDemo();
        ci.arrayListWithDataTypeDemo();
        ci.hashMapWithoutDataTypeDemo();
        ci.hashMapWithDataTypeDemo();
    }

    private void hashSetWithoutDataTypeDemo(){
        System.out.println("--------------------hashSetWithoutDataTypeDemo-----------------------");
        Set set = new HashSet();
        System.out.println(set.size());//0
        set.add("Guest1");
        set.add("Guest2");
        set.add("Guest3");
        System.out.println(set.size());//3
        for(Object o : set) {
            System.out.println(o);//object retrieval directly
        }
        set.add("Guest1");//Doesn't allow duplicate values, so it removed the previous entry and made afresh entry
        System.out.println(set.size());//3
        for(Object o : set) {
            System.out.println(o.toString());//object retrieval after converting to string (conversion is not necessary though)
        }
        System.out.println("-------------------------------------------");
    }

    private void hastSetWithDataTypeDemo(){
        System.out.println("----------------------hastSetWithDataTypeDemo---------------------");
        Set<String> set = new HashSet<String>();
        set.add("Guest1, 9876543210");
        set.add("Guest2, 1234567890");
        for (String s : set){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }

    private void arrayListWithoutDataTypeDemo(){
        System.out.println("--------------------arrayListWithoutDataTypeDemo-----------------------");
        List list = new ArrayList();
        list.add("Guest1");
        list.add("Guest1");//allows duplicate values
        System.out.println(list.size());//2
        for (Object o:list){
            System.out.println(o);
        }
        System.out.println("-------------------------------------------");
    }

    private void arrayListWithDataTypeDemo(){
        System.out.println("--------------------arrayListWithDataTypeDemo-----------------------");
        List<String> list = new ArrayList<String>();
        list.add("Guest2");
        list.add("Guest2");

        System.out.println(list.size());//2
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }

    private void hashMapWithoutDataTypeDemo(){
        System.out.println("--------------------hashMapWithoutDataTypeDemo-----------------------");
        Map map = new HashMap();
        System.out.println(map.size());//0
        map.put("Guest1", 101);
        map.put("Guest2", 102);
        map.put("Guest3", 103);
        System.out.println(map.size());//3
        for(Object o : map.keySet()) {
            System.out.println("Key:"+ o + ", Value:" + map.get(o));
        }
        System.out.println("KEY=VALUE");
        for(Object o : map.entrySet()) {
            System.out.println(o);
        }
        map.put("Guest1", 102);//Doesn't allow duplicate keys, values can be duplicate though
        System.out.println(map.size());//3
        for(Object o : map.entrySet()) {
            System.out.println("Key:"+ o.toString().split("=")[0] + ",Value" + o.toString().split("=")[1]);
        }
        System.out.println("-------------------------------------------");
    }

    private void hashMapWithDataTypeDemo(){
        System.out.println("--------------------hashMapWithDataTypeDemo-----------------------");
        Map<String,Integer> map = new HashMap<String,Integer>();
        System.out.println(map.size());//0
        map.put("Guest1", 101);
        map.put("Guest2", 102);
        map.put("Guest3", 103);
        System.out.println(map.size());//3
        for(String s : map.keySet()) {
            System.out.println("Key:"+ s + ", Value:" + map.get(s));
        }
        map.put("Guest1", 102);//Doesn't allow duplicate keys, values can be duplicate though
        System.out.println(map.size());//3
        for(String s : map.keySet()) {
            System.out.println("Key:"+ s + ", Value:" + map.get(s));
        }
        System.out.println("-------------------------------------------");
    }
}

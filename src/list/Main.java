package list;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //array List
        List<String> list = new ArrayList<>();
        list.add("blal");
        list.add("hell");
        list.add("0");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String val = it.next();
            System.out.println("How it works:" + val);
        }
    //for each
        for (String str: list) {
            System.out.println(str);
        }
        //method of reference:
        // finding position
        list.forEach(System.out :: println);
        Map<String, String> map = new HashMap<String, String>();
        map.put("ha", "ba");
        map.put("he", "she");
        map.put("tets", "check");
        System.out.println(map);

        Set<String> keys = map.keySet();
        Iterator<String> it1 = keys.iterator();
        while (it1.hasNext()){
            String key = it1.next();
            System.out.println(key);
        }
        for (String key: keys) {
            System.out.println("for each:"+ key);
        }
    }
}

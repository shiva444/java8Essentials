import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
        Map<String, Integer> test = new HashMap<>();
        test.put("Karthik", 27);
        test.put("Sha", 25);
        test.put("They are perfect pair", 1);
        System.out.println(test);
        test.put("Getting married", 11);
        System.out.println(test);
        Integer get = test.get("Getting married");
        System.out.println(get);
        test.remove("Getting married", 11);
        System.out.println(test);

    }
}

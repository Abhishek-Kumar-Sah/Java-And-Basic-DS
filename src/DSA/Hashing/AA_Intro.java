package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class AA_Intro {
    public static void main(String[] args) {

        HashMap<String,Integer> m = new HashMap<>();

        m.put("gfg",10);
        m.put("ide",15);
        m.put("courses",20);

        System.out.println(m);
        System.out.println(m.size());

        for (Map.Entry<String,Integer> e : m.entrySet()){
            System.out.print(e.getKey() + "=" + e.getValue());
        }
        System.out.println();

        System.out.println(m.containsKey("ide")); // true
        System.out.println(m.remove("ide")); // 15
        System.out.println(m.size());             // 2
        System.out.println(m.containsValue(10));  // true
        System.out.println(m.containsValue(15));  // false
        System.out.println(m.get("courses"));     // 20
        System.out.println(m.get("avi"));         // null
    }
}

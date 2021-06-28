package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr ={1,3,2,4,5,3,4,2,1,3,4,5,4,3,5,3,2,1,2,3,4,5,4,3,2,6};

        System.out.println(frequencyOfElements(arr));

        for (Map.Entry<Integer,Integer> a: frequencyOfElements(arr).entrySet()) {
            System.out.println(a.getKey() + " = " + a.getValue());
        }

    }


    public static HashMap<Integer,Integer> frequencyOfElements(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

         for (int a: arr) {

//            if (hm.containsKey(a)){
//                hm.put(a,hm.get(a)+1);
//            }
//            else
//                hm.put(a,1);


             // hm.getOrDefault gets the value of the key if it's present in the map .
             // If not, then assigns the default key and adds that key value pair to map.
             hm.put(a,hm.getOrDefault(a,0) + 1);

        }

         return hm;
    }
}

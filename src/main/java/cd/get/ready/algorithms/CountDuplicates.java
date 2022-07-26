package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String,Integer> map = new HashMap<String, Integer>();

        for (String num:input) {
            if (map.containsKey(num)) {
                Integer value = map.get(num)+1;
                map.put(num,value);
            } else  {
                map.put(num,1);
            }
        }
        Integer duplicates = 0;
        for (Integer value: map.values()) {
            if (value >1) {
                duplicates++;
            }
        }
        return duplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (Integer num:input) {
            if (map.containsKey(num)) {
                Integer value = map.get(num)+1;
                map.put(num,value);
            } else  {
                map.put(num,1);
            }
        }
        Integer duplicates = 0;
        for (Integer value: map.values()) {
            if (value >1) {
                duplicates++;
            }
        }
        return duplicates;
    }
}

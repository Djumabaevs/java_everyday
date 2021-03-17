package ExPackageFeb2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Chair", 7500);
        map.put("Chair2", 8500);
        map.put("Chair3", 11500);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        double random = Math.random()*100;
        int roundOff = (int) Math.round(random);
        entry.setValue(roundOff);
            System.out.println("After change "  + entry.getValue() + " " + entry.getValue());
        }
    }
}



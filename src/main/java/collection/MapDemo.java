package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Long",3);
        map.put("Dat",1);
        map.put("Tuan",2);
        map.put("Tien",0);
        map.put("Khoa",0);

        for(Map.Entry<String, Integer> pair : map.entrySet()){
            String key= pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("🫳%s: %d%n",key, value);

        }
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}

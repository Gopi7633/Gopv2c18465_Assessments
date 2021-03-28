package HashMap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> hm = new java.util.HashMap<String, String>();
        //Add data
        hm.put(null, null);
        hm.put("A",null);
        hm.put("B", "Gopi");
        hm.put("C",null);
        //iteration
        for(String key:hm.keySet()){
            System.out.println(key);
            System.out.println(hm.get(key));
        }
    }
}

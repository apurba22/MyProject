package DataStructure;


import java.util.Map;
import java.util.HashMap;
public class UseMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("USA", "NY");
        map.put("CANADA", "MONTREAL");
        map.put("UK", "LONDON");
       for(Map.Entry entry:map.entrySet()) {
           System.out.println(entry.getKey() + " " + entry.getValue());
       }
    }
}

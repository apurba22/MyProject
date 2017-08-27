package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseListMap {
    public static void main(String[] args) {
        List<String> countryOfUsa = new ArrayList<String>();
        countryOfUsa.add("NY");
        countryOfUsa.add("Nj");
        countryOfUsa.add("CA");

        List<String> countryOfCanada = new ArrayList<String>();
        countryOfCanada.add("Montreal");
        countryOfCanada.add("Toronto");
        countryOfCanada.add("Alberta");

        List<String> countryOfUK = new ArrayList<String>();
        countryOfUK.add("London");
        countryOfUK.add("Manchester");
        countryOfUK.add("Buckingham");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("USA", countryOfUsa);
        map.put("Canada", countryOfCanada);
        map.put("UK", countryOfUK);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}


package lesson09;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class HashMap_Demo2 {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Double> mp1 = new LinkedHashMap<>();
        mp1.put("座號", 1.0);
        mp1.put("身高", 175.5);
        mp1.put("體重", 65.5);
        
        LinkedHashMap<String, Double> mp2 = new LinkedHashMap<>();
        mp2.put("座號", 2.0);
        mp2.put("身高", 155.5);
        mp2.put("體重", 45.0);
        
        LinkedHashMap<String, Double> mp3 = new LinkedHashMap<>();
        mp3.put("座號", 3.0);
        mp3.put("身高", 183.5);
        mp3.put("體重", 72.5);
        
        ArrayList<LinkedHashMap<String, Double>> list = new ArrayList<>();
        list.add(mp1);
        list.add(mp2);
        list.add(mp3);
        System.out.println(list);

    }
  
}

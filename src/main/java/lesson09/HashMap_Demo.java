
package lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;


public class HashMap_Demo {
    public static void main(String[] args) {
        
        LinkedHashMap<String, Double>  map = new  LinkedHashMap<>();
        System.out.println(map);
        System.out.println(map.get("身高"));
        
        Set<String> keys = map.keySet(); //抓取所有的key
        System.out.println(keys);
                
        for (String key : keys) {
            System.out.println(map.get(key)); //根據key來抓取value
            
        }
        
        ArrayList<Integer> values = new ArrayList(map.values());  //抓取所有的value
        System.out.println(values);
        
        //Collection<Double> list = map.values();
        
                
        
        
        
    }
}


package lesson09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;


public class TreeMap_Demo {
    public static void main(String[] args) {
        
     ArrayList<TreeMap<String, String>> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(createCode(i)); 
        }
        System.out.println(list);
    }
    
    public static  TreeMap<String, String> createCode(int no){
        TreeMap<String, String> map = new TreeMap<>();
        int code_en = new Random().nextInt(8) +4;
        String code = getcode(code_en);
        map.put("序號", String.valueOf(no));
        map.put("折扣碼", code);
        map.put("折扣", String.valueOf(new  Random().nextInt(8) +1));
        return  map;
            
        }
        
    public static String getcode(int len){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int n = new Random().nextInt(58) +65;
            sb.append((char)n);
        }
    
        return sb.toString();

    }
 
}

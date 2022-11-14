
package lesson10;

import java.util.ArrayList;


public class BMITest4 {
    public static void main(String[] args) {
       BMI01 bmi1 = new BMI01(170, 60);
       BMI01 bmi2 = new BMI01(180, 70);
       BMI01 bmi3 = new BMI01(160, 50);
       BMI01 bmi4 = new BMI01(150, 65);
       BMI01 bmi5 = new BMI01(190, 55);
       ArrayList<BMI01> list = new ArrayList<>();
       list.add(bmi1);
       list.add(bmi2);
       list.add(bmi3);
       list.add(bmi4);
       list.add(bmi5);
        System.out.println(list);
        
        double max = list.stream()
                .filter(bmi -> bmi.bmi > 18 && bmi.bmi <=23)
                .mapToDouble(bmi -> bmi.bmi)
                .max()
                .getAsDouble();
        System.out.println(max);
        
                
        
               
               
        
        
    }
   
}

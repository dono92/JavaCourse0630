
package lesson10;

import lesson10.BMI01;
import java.util.ArrayList;

public class BMITest2 {
    public static void main(String[] args) {
        BMI01 bmi1 = new BMI01(170, 60);
        BMI01 bmi2 = new BMI01(180, 70);
        BMI01 bmi3 = new BMI01(160, 50);
        ArrayList<BMI01> list = new ArrayList<>();
        list.add(bmi1);
        list.add(bmi2);
        list.add(bmi3);
        System.out.println(list);
    }
}

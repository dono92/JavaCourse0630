
package lesson10;

import lesson10.BMI;


public class BMITest01 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI(170, 60);
        bmi1.printBMI();
        
        BMI bmi2 = new BMI(180, 70);
        bmi2.printBMI();
        
        BMI bmi3 = new BMI(160, 50);
        bmi3.printBMI();
    }
}

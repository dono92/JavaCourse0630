
package lesson10;

public class BMI01 {
   public  double h;
   public double w;
   double bmi;
  
   //建構子 (new的時候會呼叫)
public BMI01 (double h, double w) {
    this.h = h;
    this.w = w;
    bmi = calcBMI();
}

//計算bmi
private double calcBMI() {
    double bmi01 = w / Math.pow( h/100, 2);
    return bmi01;
}

//列印bmi
public void printBMI() {
    if (bmi == 0) {
        bmi =calcBMI();
    }
    System.out.printf("%.2f\n" , bmi    );
}

    @Override
    public String toString() {
        return "BMI01{" + "h=" + h +" , w=" + w +" ,bmi=" +bmi + '}';
    }
}


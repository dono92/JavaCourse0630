package lesson01;

public class Check {

    public static void main(String[] args) {
        Check check = new Check();
        check.calcBMI(-170, -60);

        System.out.println("---------------");

        double bmi = check.calcBMI2(170, 60);
        System.out.println(bmi==-1?"參數錯誤":String.format("%.2f", bmi));
    }
    
    public void calcBMI(double h, double w) {
        if (!(h > 0 && w > 0)) {
            System.out.println("參數錯誤");
            return; //中止

        }

        double bmi = w / Math.pow(h / 100, 2);
        System.out.printf("$.2f\n", bmi);
    }

    public double calcBMI2(double h, double w) {
        if (!(h > 0 && w > 0)) {
            return -1;//中止
        }
        double bmi = w / Math.pow(h / 100, 2);
        return bmi;

    }
}

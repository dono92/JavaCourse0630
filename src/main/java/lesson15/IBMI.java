
package lesson15;

public interface IBMI {
        double getHeight();
        double getweight();
        default  double getBMI() {
                double h = getHeight();
                double w = getweight();
                double bmi = w / Math.pow(h/100, 2);
                return bmi;
  
    }
}


package lesson1502;

public interface IBMI {
    double getHeight();
    double getWeight();
    default double getBMI() {
        double h = getHeight();
        double w = getWeight();
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    } 
}

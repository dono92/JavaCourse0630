
package lesson1502;

public class Student01 implements IBMI,IScore01{

    @Override
    public double getHeight() {
         return 170;
    }

    @Override
    public double getWeight() {
       return 60;
    }

    @Override
    public int[] getScore() {
        return new int[]{100, 90, 80, 70, 60};
        
    }
}


package lesson1502;

public class Student202 implements IBMI,IScore01{

    @Override
    public int[] getScore() {
        return new int[]{12, 13, 14, 15, 16};
    }

    @Override
    public double getHeight() {
       return 160;
    }

    @Override
    public double getWeight() {
        return 40;
    }
    
}

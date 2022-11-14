
package lesson1501;


public class Student201 implements IBMI,IScore {

    @Override
    public double getHeight() {
       return 160;
    }

    @Override
    public double getWeight() {
        return 40;
    }

    @Override
    public int[] getScore() {
     return new int[] {15, 14, 19, 18, 17};
    }
    
}

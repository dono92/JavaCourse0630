
package lesson1403;


public class EDog implements IDog{

    @Override
    public void eat() {
        System.out.println("gv電池");
    }

    @Override
    public int speed() {
         return 100;
    }
    
    @Override
    public int getPower() {
            return 10;
    }
}

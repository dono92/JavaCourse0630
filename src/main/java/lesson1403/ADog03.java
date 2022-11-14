
package lesson1403;



public abstract class ADog03 implements IDog{

    @Override
    public  void eat(){
        System.out.println("狗飼料");
    }
    
    public abstract int getAvgLife();
    
}

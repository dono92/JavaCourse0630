
package lesson3001;

public class Fish {
    
   private int nums;
   private boolean emply = true;
   
public Fish (int nums) {
    this.nums = nums;
    
}
public int getNums() {
    return nums;
}
public synchronized void put(int  i) throws Exception {
    while (!emply) {        
        wait();
    }
    System.out.printf("女主人放第 %d 片餅乾\n", i);
    emply = false;
    notifyAll();
}

public synchronized void eat(int i) throws Exception {
    while (emply) {        
        wait();
    }
    System.out.printf("小花貓吃了第 %d 片餅乾\n", i); 
    emply = true;
    notifyAll();
     
    }    
}

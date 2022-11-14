
package lesson18.Daily01;

public class Manger01 {
    private int cash = 5000;
    private static final  String DEPT_NAME = "IT";
   
    public void job(){
        System.out.println("進場維修");
    }

   
    
    public class Memner{
        private int cash = 500;
        public void job(){
            int cash = 50;
            System.out.println(Manger01.DEPT_NAME);
            System.out.println("寫程式" + cash);
            System.out.println("寫程式" + this.cash);
            System.out.println("寫程式" + Manger01.this.cash);
        }
    }  
    
}


package lesson03;

import java.util.Random;


public class PokerDemo {
    public static void main(String[] args) {
        String[]  pokers = { "A" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
        print(pokers);
        shuffle (pokers, 10); //洗牌
        print(pokers);
        
        int score = (getScore(pokers[0]) + getScore(pokers[1])) % 10;
        System.out.println("Score = " + score);
    }
  
    //列印
    public  static void print( String[] pokers){
        for (int i = 0; i <pokers.length; i++) {
            System.out.print(pokers[i] +" ");
        }
        System.out.println();
    }
    
    //洗單次
    public  static void shuffle(String[] pokers){
        Random r = new Random();
        int p1 = r.nextInt(pokers.length); // 0~12
        int p2 = r.nextInt(pokers.length); // 0~12
        
        String x = pokers[1];
        String y = pokers[2];
        
        pokers[p1] = y;
        pokers[p2] = x;
        
    }
    
    //洗多次
    public  static  void  shuffle(String[] pokers , int count){
        for (int i = 0; i < count; i++) {
            shuffle(pokers);
        }
        }
        
    public static int getScore(String card) {
        switch (card) {
            case "A":
                return  1;
            case "10" :
            case "J" :
            case "Q" :
            case "K" :
                return  0;
                
        }
        
        return Integer.parseInt(card); //字串轉數字
        
        
    }

    static int getBaccaraScore(String poker, String poker0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

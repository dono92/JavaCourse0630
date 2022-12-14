
package lesson03;

import static lesson03.DiceDemo.print;
import static lesson03.DiceDemo.throwDice;
import  static  java.lang.System.out;
import java.util.Arrays;
import java.util.Random;


public class DiceDemo_java8 {
    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 6 };
        int point = throwDice(dice);
        out.println (point);
        int[] result = throwDice(dice , 3);
        print(result);
    }
    
    //拋1顆骰子
    public static int throwDice(int[] dice){
        int point = dice[new  Random().nextInt(dice.length)];
        return point;
    }
    
    //拋n顆骰子
    public  static  int[]  throwDice(int [] dice , int  amount){
        int[] result = new int[amount];
        return Arrays.stream(result).map( d -> throwDice(dice)).toArray();
        
    }
    
    //列出骰子
    public  static  void print(int [] dice) {
        out.println("[");
        Arrays.stream(dice).forEach(System.out :: print);
//   Arrays.stream(dice).forEach(d -> System.out.print(d));
//   Arrays.stream(dice).forEach(d -> 
//        System.out.print(d);
//        System.out.print(d);
//    });
       out.println("]");
    }           
}
   
    
    
    
    
    
    
    
    
    


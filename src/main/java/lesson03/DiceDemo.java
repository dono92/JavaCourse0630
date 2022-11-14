
package lesson03;

import static  java.lang.System.out;
import java.util.Random;

public class DiceDemo {
    public static void main(String[] args) {
        int[] dice = { 1, 2, 3, 4, 5, 6 };
        int point = throwDice(dice);
        out.println(point);
        int[] result = throwDice( dice, 3 );
        print(result);
        
    }
    
    // 拋1顆骰子
    public static int throwDice(int[] dice) {
        int point = dice[new  Random().nextInt(dice.length)];
        return point;
    }
    // 拋n顆骰子
    public static  int []   throwDice(int[] dice, int amount){
        int[] result = new  int[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = throwDice(dice);
        }
        return  result;
    }
    // 列出骰子
    public  static void print (int [] dice) { 
       out.print("[");
        for (int i = 0; i < dice.length; i++) {
            out.print(dice[i]);
            if (i < dice.length -1) {
                System.out.println(", ");
            }
        }
        out.println("]");
        
    }
}

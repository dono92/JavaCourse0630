
package lesson20all;

import java.util.Scanner;


public class inputDemo2 {
    public static void main(String[] args) {
       // 除法
       div();
    }
    
    public static void div(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字分子 =");
        int x = scanner.nextInt();
        System.out.println("請輸入數字分母 =");
        int y = scanner.nextInt();
        int z = x / y;
        System.out.println(z);
    }
    
    public static void div2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入數字分子 =");
        int x = scanner.nextInt();
        System.out.println("請輸入數字分母 =");
        int y = scanner.nextInt();
        if (y == 0) {
            System.out.println("分母不可為0");
            return;
        }
        int z = x / y;
        System.out.println(z);
 
    }
}

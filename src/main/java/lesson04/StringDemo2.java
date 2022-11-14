
package lesson04;

public class StringDemo2 {
    public static void main(String[] args) {
        
       char[] chars = { 'A' , 'B' , 'C' , 'D' };
       String str = "甲乙丙丁";
       
        System.out.println(chars);
        //getChars(int srcBegin, int srcEnd, char[] dst, int detBegin)
        str.getChars(1, 3, chars, 1);
        
        System.out.println(chars);
  
    }
  
}

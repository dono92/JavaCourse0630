
package lesson04;

public class StringDemo {
    public static void main(String[] args) {
        
        // 字串就是Char[]
        char[] chars = { 'J' , 'a' , 'v' , 'a' };
        String str = new String(chars);
        System.out.print(chars[0]);
        System.out.print(chars[1]);
        System.out.print(chars[2]);
        System.out.println(chars[3]);
        System.out.println(str);
        
        //長度
        System.out.println(chars.length);
        System.out.println(str.length());
        
        //char[] Resize ? Java ->Java8
        chars = new char[]{ 'J' , 'a' , 'v' , 'a' , '8' };
        System.out.println(chars);
        
     }          
   }
    
   
    
    
    
    
    
    
    
    
    
    

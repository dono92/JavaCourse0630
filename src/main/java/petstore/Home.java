
package petstore;


public class Home {
    public static void main(String[] args) {
        Cat cat = new  Cat();
        cat.name = "白爛貓";
        System.out.println(cat.name + "喜歡" );
        cat.play();
    }
   
}

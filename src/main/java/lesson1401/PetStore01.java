
package lesson1401;

public class PetStore01 {
    public static void main(String[] args) {
        PetStore01 store01 = new PetStore01();
        Chihuahua01 chihuahua01 = new Chihuahua01();
        store01.print(chihuahua01);
        Wolf01 wolf01 = new Wolf01();
        store01.print(wolf01);
         Shiba01 shiba01 = new Shiba01();
         store01.print(shiba01);
    }
    
    public void print(IDog01 dog01) {
        System.out.println(dog01.getClass().getSimpleName());
        dog01.eat();
        System.out.println("速度:" + dog01.speed());
        System.out.println("------------");
         
    }
}

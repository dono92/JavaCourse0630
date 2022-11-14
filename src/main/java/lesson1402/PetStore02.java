
package lesson1402;

public class PetStore02 {
    public static void main(String[] args) {
        PetStore02 store02 = new PetStore02();
        Chihuahua02 chihuahua02 = new  Chihuahua02();
        store02.print(chihuahua02);
        Wolf02 wolf02 = new Wolf02();
        store02.print(wolf02);
        Shiba02 shiba02 = new Shiba02();
        store02.print(shiba02);
        EDog eDog = new EDog();
        store02.print(eDog);
    }
    
    public void print(IDog dog) {
        System.out.println(dog.getClass().getSimpleName() + "有" + IDog.legs +"隻腳");
        dog.eat();
        System.out.println("速度:" + dog.speed());
        System.out.println("------------");
        
    }
 public void print(ADog02 dog02) {
     System.out.println(dog02.getClass().getSimpleName() + "平均年齡" + dog02.getAvgLife() + "歲");
     print((IDog)dog02);
        
    }
 
}

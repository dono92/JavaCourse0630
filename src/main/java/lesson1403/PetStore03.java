
package lesson1403;


public class PetStore03 {
    public static void main(String[] args) {
    PetStore03 store03 = new PetStore03();
    Chihuahua03 chihuahua03 = new Chihuahua03();
    store03.print(chihuahua03);
    Wolf03 wolf03 = new Wolf03();
    store03.print(wolf03);
    Shiba03 shiba03 = new Shiba03();
    store03.print(shiba03);
    EDog eDog = new EDog();
    store03.print(eDog);
    }
    
    public void print(IDog dog) {
        System.out.println(dog.getClass().getSimpleName() + "有" +IDog.legs + "隻腳");
        dog.eat();
        System.out.println("速度:" + dog.speed());
        System.out.println("狗力:"  +dog.getPower());
        System.out.println("--------------");
    }
    
    public void print(ADog03 dog03){
        System.out.println(dog03.getClass().getSimpleName() + "平均年齡" + dog03.getAvgLife() +"歲");
        print((IDog)dog03);
 }

}

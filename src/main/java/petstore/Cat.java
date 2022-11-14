
package petstore;

public class Cat {
   public  String name;
   
   public  void  play(){
       System.out.println("玩球");
       
       Dog dog = new  Dog();
       dog.name = "小黃狗";
       System.out.println(dog.name+ "喜歡" );
       dog.play();
       
       //petstore.water.Fish fish = new petstore.water.Fish();
       Fish fish = new Fish();
       fish.name = "金魚";
       System.out.println(fish.name + "喜歡" );
       fish.play();
       
       Bird bird = new Bird();
       bird.name = "白文鳥";
       System.out.println(bird.name + "喜歡" );
       bird.play();
       
   }
}

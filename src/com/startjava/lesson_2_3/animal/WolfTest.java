package src.com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();
        
        wolfTest.setGender("male");
        System.out.println("Gender: " + wolfTest.getGender());
        
        wolfTest.setNickname("Romeo");
        System.out.println("Nickname: " + wolfTest.getNickname());
        
        wolfTest.setWeight(45);
        System.out.println("Weight: " + wolfTest.getWeight());
        
        wolfTest.setAge(9);
        System.out.println("Age: " + wolfTest.getAge());
        
        wolfTest.setColor("Grey");
        System.out.println("Color: " + wolfTest.getColor());

        wolfTest.go();
        wolfTest.sit();
        wolfTest.run();
        wolfTest.howl();
        wolfTest.hunt();
    }
}

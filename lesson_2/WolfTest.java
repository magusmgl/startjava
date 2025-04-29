public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfTest = new Wolf();

        wolfTest.gender = "male";
        wolfTest.nickname = "Romeo";
        wolfTest.weight = 54.2f;
        wolfTest.age = 6;
        wolfTest.color = "grey";
        
        System.out.println("gender: " + wolfTest.gender);
        System.out.println("nickname: " + wolfTest.nickname);
        System.out.println("weight: " + wolfTest.weight);
        System.out.println("age: " + wolfTest.age);
        System.out.println("color: " + wolfTest.color);

        wolfTest.go();
        wolfTest.sit();
        wolfTest.run();
        wolfTest.howl();
        wolfTest.hunt();
    }
}
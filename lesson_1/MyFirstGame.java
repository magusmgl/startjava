import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int startInterval = 1;
        int endInterval = 101;
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(startInterval, endInterval);
        int userNumber = rnd.nextInt(startInterval, endInterval); 
        while (hiddenNumber != userNumber) {
            if (hiddenNumber < userNumber) {
                endInterval = userNumber;
                System.out.printf("%d больше того, что загадал компьютер", userNumber);
            } else if (hiddenNumber > userNumber) {
                startInterval = userNumber + 1;
                System.out.printf("%d меньше того, что загадал компьютер", userNumber);
            }
            userNumber = rnd.nextInt(startInterval, endInterval);
            System.out.println();
        }
        System.out.println("Вы победили!");
    }
}
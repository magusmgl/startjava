package src.com.startjava.lesson_2_3.method.naming;

public class MethodUtils {
    public static String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}
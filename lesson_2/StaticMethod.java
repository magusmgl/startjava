public class StaticMethod {
    public static String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}
public class FourthClass {
    public static String getNameCurrentMethod() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}
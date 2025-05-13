public class MainClass {
    public static void main(String[] args) {
        callingNonValueMethods();
        callingbooleanMethods();
    }

    public static void callingbooleanMethods() {
        BooleanMethods booleanMethods = new BooleanMethods();
        System.out.println(booleanMethods.shouldAppTerminate());
        System.out.println(booleanMethods.hasSequenceUniqueNum());
        System.out.println(booleanMethods.hasInputLetter());
        System.out.println(booleanMethods.hasNumsEqualDigits());
        System.out.println(booleanMethods.hasAnyAttempts());
        System.out.println(booleanMethods.hasInputEmptyOrSpacesContain());
        System.out.println(booleanMethods.hasDiceEvenNum());
        System.out.println(booleanMethods.isPathToFileValid());
        System.out.println(booleanMethods.isFileExist());
    }

    public static void callingNonValueMethods() {
        NonValueMetods nonValueMetods = new NonValueMetods();
        nonValueMetods.findLongestWord();
        nonValueMetods.selectMenuItem();
        nonValueMetods.calculateAvgRatings();
        nonValueMetods.countUniqueWordsNum();
        nonValueMetods.displayErrorMessage();
        nonValueMetods.syncDataWithStorage();
        nonValueMetods.restoreDataFromBackup();
        nonValueMetods.pauseDownloadingFile();
        nonValueMetods.resetSettings();
        nonValueMetods.writeContentsToFile();
        nonValueMetods.convertTemp();
        nonValueMetods.enterMathExp();
        nonValueMetods.identifyWinner();
        nonValueMetods.findBookByWriterName();
    }
}
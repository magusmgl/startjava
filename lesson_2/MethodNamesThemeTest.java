public class MethodNamesThemeTest {
    public static void main(String[] args) {
        execNbm();
        execBm();
    }

    private static void execBm() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.shouldAppTerminate());
        System.out.println(bm.hasUniqueNum());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualDigits());
        System.out.println(bm.hasAttempts());
        System.out.println(bm.isBlank());
        System.out.println(bm.isEvenNum());
        System.out.println(bm.isValidPath());
        System.out.println(bm.isExistFile());
    }

    private static void execNbm() {
        NonBooleanMethods nbm = new NonBooleanMethods();
        nbm.findLongestWord();
        nbm.selectMenuItem();
        nbm.calculateAvgRatings();
        nbm.countUniqueWords();
        nbm.displayErrorMessage();
        nbm.syncDataWithCloud();
        nbm.restoreFromBackup();
        nbm.pauseDownloadingFile();
        nbm.resetSettings();
        nbm.writeToFile();
        nbm.convertTemp();
        nbm.enterMathExp();
        nbm.identifyWinner();
        nbm.findBookByAuthor();
    }
}
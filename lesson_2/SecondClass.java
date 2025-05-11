public class SecondClass {
    public boolean shouldAppTerminate() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> программа выполняется далее или завершается?");
        return false;
    }

    public boolean hasSequenceUniqueNum() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> последовательность содержит уникальную цифру?");
        return true;
    }

    public boolean hasInputLetter() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> пользователь ввел букву или что-то другое?");
        return true;
    }

    public boolean hasNumsEqualDigits() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> в проверяемых числах, есть равные цифры?");
        return false; 
    }

    public boolean hasAnyAttempts() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean hasInputEmptyOrSpacesContain() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean hasDiceEvenNum() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false; 
    }

    public boolean isPathToFileValid() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isFileExist() {
        System.out.println(FourthClass.getNameCurrentMethod() +
                "() -> файл по указанному адресу существует?");
        return false;
    }
}

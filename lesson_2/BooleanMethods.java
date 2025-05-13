public class BooleanMethods {
    public boolean shouldAppTerminate() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается?\t");
        return false;
    }

    public boolean hasSequenceUniqueNum() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean hasInputLetter() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasNumsEqualDigits() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false; 
    }

    public boolean hasAnyAttempts() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean hasInputEmptyOrSpacesContain() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean hasDiceEvenNum() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false; 
    }

    public boolean isPathToFileValid() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isFileExist() {
        System.out.print(StaticMethod.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}

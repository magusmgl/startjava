public class BooleanMethods {
    public boolean shouldAppTerminate() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> программа выполняется далее или завершается? false");
        return false;
    }

    public boolean hasUniqueNum() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> пользователь ввел букву или что-то другое? ");
        return true;
    }

    public boolean hasEqualDigits() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> в проверяемых числах, есть равные цифры? ");
        return false; 
    }

    public boolean hasAttempts() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> в игре \"Марио\" остались попытки? ");
        return false;
    }

    public boolean isBlank() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return false;
    }

    public boolean isEvenNum() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return false; 
    }

    public boolean isValidPath() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(MethodUtils.getCurrentMethodName() +
                "() -> файл по указанному адресу существует? ");
        return false;
    }
}

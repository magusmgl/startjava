package src.com.startjava.lesson_2_3.method.naming;

public class NonBooleanMethods {
    public void findLongestWord() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> найти самое длинное слово в предложении из книги по Java"); 
    }

    public void selectMenuItem() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAvgRatings() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(MethodUtils.getCurrentMethodName() + 
                "() -> подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    public void displayErrorMessage() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> вывести сообщение об ошибке"); 
    }

    public void syncDataWithCloud() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> синхронизировать данные с облачным хранилищем"); 
    }

    public void restoreFromBackup() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> восстановить данные из резервной копии от 11.03.2024"); 
    }

    public void pauseDownloadingFile() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> приостановить загрузку mp3-файла группы \"Ария\""); 
    }

    public void resetSettings() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> сбросить настройки до заводских для пылесоса Mi"); 
    }

    public void writeToFile() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> записать содержимое в файл по указанному пути на флешку"); 
    }

    public void convertTemp() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> преобразовать температуру из Цельсия в Фаренгейт"); 
    }

    public void enterMathExp() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> ввести математическое выражение с тремя аргументами"); 
    }

    public void identifyWinner() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> выявить победителя среди гонщиков игры \"Need For Speed\""); 
    }

    public void findBookByAuthor() {
        System.out.println(MethodUtils.getCurrentMethodName() +
                "() -> найти книгу по имени писателя"); 
    }
}
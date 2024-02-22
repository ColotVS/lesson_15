public class lesson_15_37 {
    //Метод printStackTrace принимает в качестве параметра массив stackTrace. Нужно вывести информацию о каждом элементе массива в формате:
    //"Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
    //Информацию о каждом элементе выводи с новой строки.

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (var info:stackTrace) {
            System.out.println("Метод " + info.getMethodName()+ " вызван из строки " +info.getLineNumber()+ " класса " + info.getClassName()+" в файле " + info.getFileName()+".");
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

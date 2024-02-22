public class lesson_15_34 {
    //Stack trace

    //В языке программирования Java у программиста есть очень много способов получить информацию о том, что сейчас происходит в программе.
    //И это не просто слова.

    //Например, программы на языке C++ после компиляции превращаются в один большой файл машинного кода и все,
    //что во время выполнения доступно программисту, — это адрес куска памяти, который содержит машинный код, который сейчас выполняется.

    //В Java же, даже после компиляции, классы остаются классами, методы и переменные никуда не деваются,
    //и у программиста есть много способов получить данные о том, что сейчас происходит в программе.

    //Стек-трейс
    //Например, в любой момент работы программы можно узнать класс и имя метода, который сейчас выполняется.
    //И даже не одного метода, а получить информацию о всей цепочке вызовов методов от текущего метода до метода main().
    //Список, состоящий из текущего метода, метода, который его вызвал, его вызвавшего метода и т.д., называется stack trace.

    //Получить его можно с помощью команды:
    //StackTraceElement[] methods = Thread.currentThread().getStackTrace();

    //Можно записать ее и в две строки:
    //Thread current = Thread.currentThread();
    //StackTraceElement[] methods = current.getStackTrace();

    //Статический метод currentThread() класса Thread возвращает ссылку на объект типа Thread,
    //который содержит информацию о текущей нити (о текущем потоке выполнения).

    //У этого объекта Thread есть метод getStackTrace(), который возвращает массив элементов StackTraceElement,
    //каждый из которых содержит информацию об одном методе. Все элементы вместе и образуют stack trace.

    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(var info: methods)
            System.out.println(info);
    }

    //Вывод на экран
    //java.base/java.lang.Thread.getStackTrace(Thread.java:1606)
    //Main.test(Main.java:11)
    //Main.main(Main.java:5)

    //Как мы видим по выводу на экран, в приведенном примере метод getStackTrace() вернул массив из трех элементов:
    //Метод getStackTrace() класса Thread
    //Метод test() класса Main
    //Метод main() класса Main

    //Из этого стек-трейса можно сделать вывод, что:
    //Метод Thread.getStackTrace() был вызван методом Main.test() в строке 11 файла Main.java
    //Метод Main.test() был вызван методом Main.main() в строке 5 файла Main.java
    //Метод Main.main() никто не вызывал — это первый метод в цепочке вызовов.

    //Кстати, на экране отобразилась только часть всей имеющийся информации.
    //Все остальное можно получить прямо из объекта StackTraceElement
}
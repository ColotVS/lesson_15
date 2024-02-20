public class lesson_15_36 {
    //StackTraceElement

    //Класс StackTraceElement, как следует из его названия, создан для того,
    //чтобы хранить информацию по одному элементу stack trace — т.е. по одному методу из StackTrace.

    //У объектов этого класса есть такие методы:
    //Метод	                        Описание
    //String getClassName()         Возвращает имя класса
    //String getMethodName()        Возвращает имя метода
    //String getFileName()          Возвращает имя файла (в одном файле может быть много классов)
    //int getLineNumber()           Возвращает номер строки в файле, в которой был вызов метода
    //String getModuleName()        Возвращает имя модуля (может быть null)
    //String getModuleVersion()     Возвращает версию модуля (может быть null)

    //С их помощью можно получить более полную информацию о текущем стеке вызовов:
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for(StackTraceElement info: methods)
        {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());

            System.out.println(info.getModuleName());
            System.out.println(info.getModuleVersion());
            System.out.println();
        }
    }

    //Вывод на экран        Примечание
    //java.lang.Thread      имя класса
    //getStackTrace         имя метода
    //Thread.java           имя файла
    //2514                  номер строки
    //java.base             имя модуля
    //20.0.2                версия модуля

    //lesson_15_36          имя класса
    //test                  имя метода
    //lesson_15_36.java     имя файла
    //25                    номер строки
    //null                  имя модуля
    //null                  версия модуля

    //lesson_15_36          имя класса
    //main                  имя метода
    //lesson_15_36.java     имя файла
    //19                    номер строки
    //null                  имя модуля
    //null                  версия модуля

}

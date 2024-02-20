public class lesson_15_22 {
    //Собственные исключения

    //Вы всегда можете создать свой собственный класс-исключение.
    //Просто унаследовав класс от, например, RuntimeException. Выглядеть это будет примерно так:
    /*
    class ИмяКласса extends RuntimeException
    {

    }
    */
    //Однако, даже если у вас есть только такой простой класс — вообще без кода, вы все равно можете выбрасывать его исключения:
    public static void main(String[] args)
    {
        throw new MyException();            //Выбрасываем unchecked-исключение MyException.
    }

}
class MyException extends RuntimeException
{
}


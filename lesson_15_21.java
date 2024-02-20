public class lesson_15_21 {
    //Множественный перехват исключений

    //Программисты очень не любят дублирование кода. Даже придумали такой принцип разработки — DRY: Don’t Repeat Yourself.
    //Однако при обработке исключений часто возникают ситуации, когда после блока try следует несколько блоков catch с одинаковым кодом.
    //Или может быть, например, 3 catch-блока с одним кодом и еще 2 catch-блока с другим.
    //Стандартная в общем-то ситуация, когда у вас в проекте ответственно относятся к обработке исключений.
    //Начиная с 7-й версии, в язык Java добавили возможность указать несколько типов исключений в одном блоке catch.
    //Выглядит это примерно так:
    /*
    try
    {
        код, где может возникнуть ошибка
    }
    catch(ТипИсключения1 | ТипИсключения2 | ТипИсключения3 имя)
    {
        код обработки исключений
    }
    */

    //Блоков catch может быть сколько угодно. Однако в одном блоке catch нельзя указать исключения, которые наследуются друг от друга.
    //Т.е. нельзя написать catch (Exception | RuntimeException e), т.к. класс RuntimeException унаследован от Exception.

    //Объедини блоки catch с одинаковым кодом.

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}

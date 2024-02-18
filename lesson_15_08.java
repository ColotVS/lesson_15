import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lesson_15_08 {
    //Несколько блоков catch

    //Можно после блока try не один блок catch, а несколько.

    //  try
    //  {
    //      код, где может возникнуть ошибка
    //  }
    //  catch(ТипИсключения1 имя1)
    //  {
    //      код обработки исключения1
    //  }
    //  catch(ТипИсключения2 имя2)
    //  {
    //      код обработки исключения2
    //  }
    //      catch(ТипИсключения3 имя3)
    //  {
    //      код обработки исключения3
    //  }

    //Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
    //Методы parseInt и get могут бросать исключения NumberFormatException и ArrayIndexOutOfBoundsException.
    //Оберни их одним блоком try с двумя блоками catch.
    //Блок catch для NumberFormatException должен выводить сообщение: "Нужно ввести целое число",
    //а блок catch для ArrayIndexOutOfBoundsException должен выводить сообщение: "Студента с таким номером не существует".

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(EXIT)) {
                break;
            }

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            }
            catch (NumberFormatException e)
            {
                System.out.println(INTEGER_REQUIRED);
                continue;
            }
            catch (ArrayIndexOutOfBoundsException a)
            {
                System.out.println(NOT_EXIST);
            }

        }
    }
}

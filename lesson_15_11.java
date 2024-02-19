import java.util.Scanner;

public class lesson_15_11 {
    //Свое исключение

    //Кстати, вы можете сами создать объект-исключение:
    //это просто объект типа Exception или унаследованного от него класса. И выбросить его.

    //Пример:

    //  try
    //  {
    //      throw new RuntimeException();
    //  }
    //  catch(Exception except)
    //  {
    //      System.out.println("Перехватили исключение");
    //      throw except;
    //  }

    //В примере выше мы создали новый объект-исключение типа
    //RuntimeException и тут же выбросили его с помощью оператора throw.
    //Оно будет сразу захвачено блоком catch, т.к. тип RuntimeException унаследован от типа Exception.
    //Код catch(Exception except)
    //захватывает объекты-исключения всех классов, унаследованных от класса Exception.

    //Разберись, что делает программа.
    //В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.equalsIgnoreCase("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}

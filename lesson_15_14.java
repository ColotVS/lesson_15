public class lesson_15_14 {
    //Виды исключений

    //Все исключения делятся на 4 вида, которые на самом деле являются классами, унаследованными друг от друга.

    //Класс Throwable
    //Самым базовым классом для всех исключений является класс Throwable.
    //В классе Throwable содержится код, который записывает текущий стек-трейс вызовов функций в массив.
    //В оператор throw можно передать только объект класса-наследника Throwable.
    //И хотя теоретически можно написать код вида throw new Throwable(); — так обычно никто не делает.
    //Главная цель существования класса Throwable — единый класс-предок для всех исключений.

    //Класс Error
    //Следующим классом исключений является класс Error — прямой наследник класса Throwable.
    //Объекты типа Error (и его классов-наследников) создает Java-машина в случае каких-то серьезных проблем.
    //Например, сбой в работе, нехватка памяти, и т.д.
    //Обычно вы как программист ничего не можете сделать в ситуации,
    //когда в программе возникла ошибка типа Error: слишком серьезна такая ошибка.
    //Все, что вы можете сделать — уведомить пользователя,
    //что программа аварийно завершается или записать всю известную информацию об ошибке в лог программы.

    //Класс Exception
    //Исключения типа Exception (и RuntimeException) — это обычные ошибки,
    //которые возникают во время работы многих методов.
    //Цель каждого выброшенного исключения — быть захваченным тем блоком catch, который знает,
    //что нужно сделать в этой ситуации.
    //Когда какой-то метод не может выполнить свою работу по какой-то причине,
    //он сразу должен уведомить об этом вызывающий метод, выбрасывая исключение соответствующего типа.
    //Другими словами, если какая-то переменная оказалась равна null,
    //метод выкинет NullPointerException, если в метод передали неверные аргументы —
    //выкинет InvalidArgumentException, если в методе случайно было деление на ноль — ArithmeticException.

    //Класс RuntimeException
    //RuntimeException — это разновидность (подмножество) исключений Exception.
    //Можно даже сказать, что RuntimeException — это облегченная версия обычных исключений (Exception):
    //на такие исключения налагается меньше требований и ограничений
}
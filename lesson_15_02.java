public class lesson_15_02 {
    //Нештатные ситуации

    //При работе любой программы могут возникать нештатные ситуации.

    //Например, вы решили сохранить файл, а на диске нет места. Или программа пытается записать данные в память, а памяти мало.
    //Или вы скачиваете картинку из интернета, а в процессе скачивания пропала связь.

    //Программист (автор программы) должен каждую нештатную ситуацию
    //а) предугадать,
    //б) решить, как именно программа должна работать в этой ситуации,
    //в) запрограммировать решение, максимально близкое к желаемому.

    //Поэтому довольно долго у программ было очень простое поведение: если в программе происходила ошибка, программа закрывалась.
    //И это был достаточно хороший подход.

    //Допустим, вы хотите сохранить документ на диск, и в процессе сохранения выясняется, что места на диске не хватает.
    //Какой вариант поведения программы вам бы понравился больше всего:
    //Программа закрылась
    //Программа продолжила работать, но файл не сохранила.

    //Программисту-новичку может показаться, что второй вариант лучше, ведь программа-то работает. Но на самом деле это не так.
    //Представьте, что вы 3 часа набирали документ в Word’е, хотя еще на второй минуте работы стало ясно,
    //что программа не может сохранить документ на диск. Что лучше — потерять две минуты работы или три часа?
    //Если программа не может сделать то, что нужно, лучше пусть она закроется, чем продолжает делать вид, что все в порядке.
    //Лучшее, что может сделать программа в случае сбоя, который не может исправить самостоятельно — тут же уведомить пользователя о проблеме.

    //Предыстория возникновения исключений

    //Нештатные ситуации бывают не только у программ, но и внутри программы — у методов. Например:
    //Метод хочет записать файл на диск, а места нет.
    //Метод хочет вызвать функцию у переменной, а переменная == null.
    //В методе возникло деление на 0.

    //При этом вызывающий метод возможно мог бы исправить ситуацию (выполнить альтернативный сценарий),
    //если бы знал, какая именно проблема произошла во время работы вызываемого метода.
    //Если мы пытаемся сохранить файл на диск и такой файл уже существует,
    //можно просто попросить у пользователя подтверждение для перезаписи файла.
    //Если на диске нет места, можно вывести пользователю уведомление и предложить выбрать другой диск.
    //А если у программы закончилась память — аварийно завершится.

    //Когда-то давно программисты думали над этим вопросом и придумали такое решение:
    //все методы/функции должны возвращать код ошибки в качестве результата своей работы.
    //Если функция отработала отлично, она возвращала 0, если нет — возвращала код ошибки (не ноль).

    //При таком подходе к ошибкам программисту после вызова практически каждой функции нужно было добавлять проверку,
    //не завершилась ли функция с ошибкой.

    //Кроме того, очень часто функция, которая «видела», что произошла ошибка, не знала, что с ней делать:
    //ошибку нужно было вернуть вызывающей функции, а та возвращала ее своей вызывающей и т.д.
    //В большой программе цепочка из десятков вызовов функций — это норма:
    //иногда даже можно встретить глубину вызова в сотни функций.
    //И вот нужно передать код ошибки с самого низа на самый верх.
    //И если где-то на этом пути какая-то функция не обработает код завершения, ошибка потеряется.
    //Еще один минус такого подхода в том, что если функции возвращали код ошибки, они больше не могли возвращать значения своей работы.
    //Приходилось передавать результат вычислений через параметры-ссылки.
    //Это делало код еще более громоздким и еще больше увеличивало количество ошибок.
}

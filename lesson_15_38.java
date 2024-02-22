import java.util.Stack;

public class lesson_15_38 {
    //Стек

    //Стек — это структура хранения данных, в которую можно добавлять элементы и из которой можно забирать элементы.
    //Причем брать элементы можно только с конца: сначала последний добавленный, потом — предпоследний, и т.д.
    //Само название Stack переводится с английского как «стопка» и очень похоже на стопку бумаги.
    //Если вы положите на стопку бумаги листы 1, 2 и 3, взять вы их сможете только в обратном порядке:
    //сначала третий, затем второй, а только затем первый.
    //В Java даже есть специальная коллекция с таким поведением и таким же названием — Stack.
    //Этот класс в своем поведении очень похож на ArrayList и LinkedList.  Однако у него есть еще методы, которые реализуют поведение стека:

    //Методы	                Описание
    //T push(T obj)             Добавляет элемент obj в конец списка (наверх стопки)
    //T pop()                   Забирает элемент с верха стопки (высота стопки уменьшается)
    //T peek()                  Возвращает элемент с верха стопки (стопка не меняется)
    //boolean empty()           Проверяет, не пуста ли коллекция
    //int search(Object obj)    Ищет объект из коллекции, возвращает его index

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();     //Содержимое стека (вершина справа)
        stack.push(1);                              //[1]
        for(Integer index:stack) {System.out.print(index);}
        System.out.println();
        stack.push(2);                              //[1, 2]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        stack.push(3);                              //[1, 2, 3]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        int x = stack.pop();                             //[1, 2]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        stack.push(4);                              //[1, 2, 4]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        int y = stack.peek();                            //[1, 2, 4]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        stack.pop();                                     //[1, 2]
        for(Integer index:stack) {System.out.print(index + " ");}
        System.out.println();
        stack.pop();                                     //[1]

    }
}

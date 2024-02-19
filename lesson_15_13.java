public class lesson_15_13 {
    //Запусти программу и посмотри, что происходит.
    //В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить.

    //Ожидаемый вывод в случае, когда food != null:
    //ищет еду
    //нашел мясо
    //все съел
    //лег спать

    //Ожидаемый вывод когда food == null:
    //ищет еду
    //ничего не нашел
    //лег спать голодным

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}

class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.name);
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
            return;
        }
        finally
        {
            System.out.println("лег спать" + (food == null ? " голодным" : ""));
        }
    }
}
class Food {

    String name;

    public Food(String name) {
        this.name = name;
    }
}

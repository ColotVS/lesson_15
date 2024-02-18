import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class lesson_15_03 {
    //Для начала разберись, что делает программа, а затем:
    //В методе addUser обработай значение, возвращаемое методом setName:
    //если setName вернул -1, выведи сообщение: "Имя не может быть null."
    //если -2, выведи сообщение: "Имя не может быть пустым."
    //если -3, выведи сообщение: "Имя не может содержать цифры."
    //если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."
    //В методе addUser обработай значение, возвращаемое методом setAge:
    //если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше 0."
    //если -2, выведи сообщение: "Возраст не может быть больше 150."
    //если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."
    //В методе findUserIndex обработай значение, возвращаемое методом indexOf:
    //если indexOf вернул -1, выведи сообщение "Пользователь '<имя пользователя>' не найден."
    //иначе — оставь текущее сообщение
    //Класс User не изменяй.
    public static final String INPUT_NAME = "\nВведите имя: ";
    public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";

    public static final String CANNOT_BE_NULL = "Имя не может быть null.";
    public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
    public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
    public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
    public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
    public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";

    public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
    public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаэль");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        int statusName = user.setName(name);
        if (statusName == -1)
        {
            System.out.println(CANNOT_BE_NULL);
        }
        else if (statusName == -2)
        {
            System.out.println(CANNOT_BE_EMPTY);
        }
        else if (statusName == -3)
        {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        }
        else if (statusName > 0 || statusName <(-3))
        {
            System.out.println(UNKNOWN_ERROR);
        }
        else user.setName(name);

        int statusAge = user.setAge(age);
        if (statusAge == -1)
        {
            System.out.println(CANNOT_BE_NEGATIVE);
        }
        else if (statusAge == -2)
        {
            System.out.println(CANNOT_BE_TOO_BIG);
        }
        else if (statusAge > 0 || statusAge <(-3))
        {
            System.out.println(UNKNOWN_ERROR);
        }
        else user.setAge(age);
        users.add(user);
    }

    static void findUserIndex(User user) {
        int index = users.indexOf(user);
        if (index == -1)
        {
            System.out.printf(NOT_FOUND, user.getName());
        }
        else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }

}

class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".*\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
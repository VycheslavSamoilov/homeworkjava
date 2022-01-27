import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] questions = {"Сколько сантиметров в 1 метре;",
                "Кто больше весит;",
                "У кого длиньше 8=====D;"};
        String[][] response = {{"1000 sm", "100 sm", "10 sm", "2"},
                {"Собака", "Человек", "Слон", "3"},
                {"Собака", "Человек", "Бегемот", "3"}};

        int i;
        int j = 0;
        int res;
        int result = 0;
        System.out.println("Ответе на вопросы тэста ");
        for (res = 0; res < questions.length; res++) {
            System.out.println("Вопрос " + (res + 1) + " " + questions[res]);
            int number = 0;
            for (i = 0; i < 3; i++) {
                number++;
                System.out.println(number + " Ответ - " + response[j][i] + "\n");
            }
            System.out.println("Введите ответ от 1 до 3");
            Scanner scanner = new Scanner(System.in);
            int otv = scanner.nextInt();
            if (otv == Integer.parseInt(response[j][3])) {
                System.out.println("Вы приняли правельное решение! ");
                result++;
            }
            ++j;
            System.out.println("\nКоличество правельных ответов = " + result);
        }
    }
}

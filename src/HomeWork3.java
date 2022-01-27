import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] questions = {"Сколько сантиметров в 1 метре;",
                "Кто больше весит;",
                "У кого длиньше 8=====D;"};
        String[][] response = {{"1000 sm", "100 sm", "10 sm", "2"},
                {"Собака", "Человек", "Слон", "3"},
                {"Собака", "Человек", "Бегемот", "3"}};
        int otv = 0;
        int i;
        int res;
        int result = 0;
        System.out.println("Ответе на вопросы тэста ");
        while (result != 3) {
            int j = 0;
            for (res = 0; res < questions.length; res++) {
                System.out.println("Вопрос " + (res + 1) + " " + questions[res]);
                int number = 0;
                for (i = 0; i < 3; i++) {
                    number++;
                    System.out.println(number + " Ответ - " + response[j][i] + "\n");
                }
                System.out.println("Введите ответ от 1 до 3");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    otv = scanner.nextInt();
                    System.out.println(" Вы ввели число " + otv);
                    if (otv != 1 || otv != 2 || otv != 3) {
                        System.out.println("Необходимо ввести цифру от 1 до 3 ");
                        System.exit(1);
                    }
                } else {
                    System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
                    System.out.println("Необходимо ввести цифру от 1 до 3 ");
                    System.exit(1);
                }

                if (otv == Integer.parseInt(response[j][3])) {
                    System.out.println("Вы приняли правельное решение!:) ");
                    result++;
                } else {
                    System.out.println("Вы Допустили ошибку! :( ");
                }
                ++j;
            }
            System.out.println("\nКоличество правельных ответов = " + result + "\n" +
                    "Необходимо пройти тэст повторно количество правельных ответов не = 3\n");

        }
    }
}

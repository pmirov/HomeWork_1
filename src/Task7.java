import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        int num1;
        int num2;
        while (true) {
            try {
                String input = scanner.nextLine();
                String[] numbers = input.split(" ");
                num1 = Integer.parseInt(numbers[0]);
                num2 = Integer.parseInt(numbers[1]);                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }

        if (num1 > num2)
        {
            int tmp;
            tmp = num2;
            num2 = num1;
            num1 = tmp;

        }
        for (int i = num1; i <= num2; i++) {
            if (i%2 != 0) {
                System.out.println(i + " ");
            }

        }
    }
}

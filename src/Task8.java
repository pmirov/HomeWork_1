import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел");
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
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" "+ i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }

    }
}

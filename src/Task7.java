import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        for (int i = num1; i <= num2; i++) {
            if (i%2 != 0) {
                System.out.println(i + " ");
            }

        }
    }
}

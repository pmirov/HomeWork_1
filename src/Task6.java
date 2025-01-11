import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров:");
        double length;
        while (true) {
            try {
                length = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }
        System.out.println("Выберите единицу измерения: \n1 - метр \n2 - дюйм \n3 - ярд ");
        String valueLength = scanner.nextLine();
        switch (valueLength)
        {
            case "1":
                System.out.println("Длина в метрах: " + length + " м");
                break;
            case "2":
                System.out.println("Длина в дюймах: " + length * 39.37 + " д");
                break;
            case "3":
                System.out.println("Длина в ярдах: " + length * 1.09 + " yd");
                break;
            default:
                System.out.println("Ошибка! Нужно ввести число 1 до 3");
                break;
        }
    }
}

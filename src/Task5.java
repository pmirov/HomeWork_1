import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 до 12:");
        while (true)
        {
            String text = scanner.nextLine();
            switch (text)
            {
                case "1":
                case "2":
                case "12":
                    System.out.println("Winter");
                    break;
                case "3":
                case "4":
                case "5":
                    System.out.println("Spring");
                    break;
                case "6":
                case "7":
                case "8":
                    System.out.println("Summer");
                    break;
                case "9":
                case "10":
                case "11":
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("Ошибка! Нужно ввести число 1 до 12");
                    break;
            }



        }


    }
}

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //System.out.println(text);
        switch (text)
        {
            case "1":
                System.out.println("Winter");
                break;
            case "2":
                System.out.println("Spring");
                break;
            case "3":
                System.out.println("Summer");
                break;
            case "4":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }


    }
}

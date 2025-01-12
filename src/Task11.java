import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ: ");

        String symbol = scanner.nextLine();
        char symb = symbol.charAt(0);

        System.out.println("Введите длину линии: ");
        int length;
        while (true) {
            try {
                String line = scanner.nextLine();
                length =  Integer.parseInt(line); break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }

        System.out.println("Введите направление линии 0 - горизонтально, 1 - вертикально: ");
        int isHorizont;
        while (true) {
            try {
                String horizont = scanner.nextLine();
                isHorizont = Integer.parseInt(horizont); break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }

        DrawLine(symb, length,isHorizont);
    }
    public static void DrawLine(char symbol, int length, int isHorizontal) {
        for (int i = 0; i < length; i++) {
            if (isHorizontal == 0)
            {
                System.out.print(symbol);
            }
            else
            {
                System.out.println(symbol);
            }
        }
    }
}

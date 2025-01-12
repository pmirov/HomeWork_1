import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String symbol = scanner.nextLine();
        char symb = symbol.charAt(0);
        System.out.println("Введите длину линии: ");
        String line = scanner.nextLine();
        int length =  Integer.parseInt(line);
        System.out.println("Введите направление линии 0 - горизонтально, 1 - вертикально: ");
        String horizont = scanner.nextLine();
        int isHorizont = Integer.parseInt(horizont);

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

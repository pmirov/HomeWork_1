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
        String bo = scanner.nextLine();
        System.out.println("Введите направление линии 0 - горизонтально, 1 - вертикально: ");
        boolean bool = Boolean.parseBoolean(bo);

    }
    public void drawLine(char symbol, int length, boolean isHorizontal) {
        for (int i = 0; i < length; i++) {
            System.out.println(symbol);
        }
    }
}

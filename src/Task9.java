import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,10);
            System.out.print(array[i] + " ");
        }
        int numPos = 0;
        int numNeg = 0;
        int numNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
            {
                numPos++;
            }
            if (array[i] < 0)
            {
                numNeg++;
            }
            if (array[i] == 0)
            {
                numNull++;
            }
        }
        System.out.println("\nКоличество отрицательных элементов: " + numNeg +
                           "\nКоличество положительных элеменов: " + numPos +
                           "\nКоличество нулей: " + numNull
        );
    }
}

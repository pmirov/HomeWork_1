import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,11);
            System.out.print(array[i] + " ");
        }
        int numPos = 0;
        int numNeg = 0;
        int numNull = 0;
        int min = array[0];
        int max = array[0];
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
            if (array[i] < min)
            {
                min = array[i];
            }
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println("\nКоличество отрицательных элементов: " + numNeg +
                           "\nКоличество положительных элеменов: " + numPos +
                           "\nКоличество нулей: " + numNull +
                           "\nМинимальный элемент: " + min +
                           "\nМаксимальный элемент: " + max

        );
    }
}

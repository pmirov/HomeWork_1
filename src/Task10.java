import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,11);
            System.out.print(array[i] + " ");
        }
        int[] evenNumbers = new int[]{};
        int[] oddNumbers;
        int[] negativeNumbers;
        int[] positiveNumbers;
        int numOdds = 0;
        int numEvens = 0;
        int numNegative = 0;
        int numPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
            {
                numPositive++;
            }
            if (array[i] < 0)
            {
                numNegative++;
            }
            if (array[i]%2 == 0)
            {
                numEvens++;
            }
            if (array[i]%2 != 0)
            {
                numOdds++;
            }


        }
    }
}

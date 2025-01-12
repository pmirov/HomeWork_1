import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,11);
            System.out.print(array[i] + " ");
        }

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
            if (array[i]%2 == 0 && array[i] != 0)
            {
                numEvens++;
            }
            if (array[i]%2 != 0)
            {
                numOdds++;
            }

        }
        int[] evenNumbers = new int[numEvens];
        int[] oddNumbers = new int[numOdds];
        int[] negativeNumbers = new int[numNegative];
        int[] positiveNumbers = new int[numPositive];

        for (int i = 0, i1 = 0, i2 = 0, i3 = 0, i4 = 0; i < array.length; i++) {
            if(array[i]%2 == 0 && array[i] !=0)
            {
                evenNumbers[i1] = array[i];
                i1++;
            }
            if(array[i]%2 != 0)
            {
                oddNumbers[i2] = array[i];
                i2++;
            }
            if(array[i] < 0)
            {
                negativeNumbers[i3] = array[i];
                i3++;
            }
            if(array[i] > 0)
            {
                positiveNumbers[i4] = array[i];
                i4++;
            }

        }
        System.out.println("\nМассив из четных чисел:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(" " + evenNumbers[i]);
        }
        System.out.println("\nМассив из нечетных чисел:");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(" " + oddNumbers[i]);
        }
        System.out.println("\nМассив из положительных чисел:");
        for (int i = 0; i < positiveNumbers.length; i++) {
            System.out.print(" " + positiveNumbers[i]);
        }
        System.out.println("\nМассив из отрицательных чисел:");
        for (int i = 0; i < negativeNumbers.length; i++) {
            System.out.print(" " + negativeNumbers[i]);
        }
    }
}

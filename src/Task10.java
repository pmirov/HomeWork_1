import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10,11);
            System.out.print(array[i] + " ");
        }
    }
}

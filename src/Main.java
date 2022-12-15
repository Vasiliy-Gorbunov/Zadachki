import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вы хотите ввести: ");
        int count = in.nextInt();
        System.out.println("Введите числа:");
        int[] numbers = new int[count];
        String[] stringNum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            stringNum[i] = Integer.toString(numbers[i]);
        }
        int max = 0;
        for (int index : numbers) {
            if (index > max) {
                max = index;
            }
        }
        double maxLog10 = Math.ceil(Math.log10(max + 0.5));
        int count2 = (int) maxLog10;
        System.out.println(Arrays.toString(stringNum));
        int[][] compareMassive = new int[count][count2];*/
        String test = "15975332568";
        char[] testArray = new char[test.length()];
        for (int i = 0; i < test.length(); i++) {
            testArray[i] = test.charAt(i);
        }
        System.out.println(Arrays.toString(testArray));
    }
}
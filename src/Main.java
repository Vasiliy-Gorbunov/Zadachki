import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вы хотите ввести: ");
        int count = in.nextInt();
        System.out.println("Введите числа:");
        double[] numbers = new double[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            while (numbers[i] >= 10) {
                numbers[i] = numbers[i]/10;
            }
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] % 1 > 0) {
                numbers[i] = numbers[i]*10;
            }
        }
        System.out.println("Наименьшее составное число из введённых чисел: ");
        for (double index:numbers) {
            System.out.print((int)index);
        }
    }
}
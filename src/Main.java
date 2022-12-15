import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько чисел вы хотите ввести: ");
        int count = in.nextInt();
        System.out.println("Введите числа:");
        double[] numbers = new double[count];
        int[] deci = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            if (numbers[i] % 10 == 0) {
                while (numbers[i] % 10 == 0) {
                    deci[i]++;
                    numbers[i] = numbers[i] / 10;
                }
            } else {
                while (numbers[i] >= 10) {
                    numbers[i] = numbers[i] / 10;
                }
            }
        }
        boolean sorted = false;
        double temp;
        int deciTemp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    deciTemp = deci[i];
                    deci[i] = deci[i + 1];
                    deci[i + 1] = deciTemp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] % 1 > 0) {
                numbers[i] = numbers[i] * 10;
            }
            numbers[i] = numbers[i] * Math.pow(10, deci[i]);
        }
        System.out.println("Наименьшее составное число из введённых чисел: ");
        for (double index : numbers) {
            System.out.print((int) index);
        }
    }
}
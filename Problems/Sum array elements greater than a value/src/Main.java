import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i : array) {
            if (i > number) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
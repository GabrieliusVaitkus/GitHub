import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            min = array[0];
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
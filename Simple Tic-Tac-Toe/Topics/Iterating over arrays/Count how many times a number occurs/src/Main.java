import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int anchor = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == anchor) {
                result++;
            }
        }
        System.out.println(result);
    }
}
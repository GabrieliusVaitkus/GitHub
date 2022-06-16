import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int result = number + (2 - number % 2);

        System.out.println(result);

    }
}
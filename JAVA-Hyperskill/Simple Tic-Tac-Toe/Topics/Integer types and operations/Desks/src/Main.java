import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        final int result = (a / 2 + a % 2 + b / 2 + b  % 2 + c / 2 + c % 2);

        System.out.println(result);
    }
}
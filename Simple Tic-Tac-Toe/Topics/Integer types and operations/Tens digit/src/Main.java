import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tens = scanner.nextInt();
        tens = (tens % 100) / 10;

        System.out.println(tens);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        seconds1 = seconds1 + (hours1 * 3600) + (minutes1 * 60);

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        seconds2 = seconds2 + (hours2 * 3600) + (minutes2 * 60);

        int result = seconds2 - seconds1;

        System.out.println(result);
    }
}
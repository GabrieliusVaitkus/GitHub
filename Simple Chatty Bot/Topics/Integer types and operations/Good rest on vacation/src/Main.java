import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightCost = scanner.nextInt();

        int result = foodCost * days + flightCost * 2 + nightCost * (days - 1);

        System.out.println(result);
    }
}
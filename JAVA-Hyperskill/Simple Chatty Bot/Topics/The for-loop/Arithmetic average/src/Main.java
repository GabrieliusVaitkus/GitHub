import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        int lower = Math.min(a, b);
        int upper = Math.max(a, b);
        int total = 0;
        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 3 == 0) {
                total += i;
                count++;
            }
        }
        double result = (double) total / count;
        System.out.println(result);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean sumOfTwenty1 = (a + b) == 20;
        boolean sumOfTwenty2 = (a + c) == 20;
        boolean sumOfTwenty3 = (b + c) == 20;

        System.out.println(sumOfTwenty1 || sumOfTwenty2 || sumOfTwenty3);

    }
}
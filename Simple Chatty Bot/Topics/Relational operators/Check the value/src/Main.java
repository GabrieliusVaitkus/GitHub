import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        boolean lessThanTen = (numberOne < 10);

        System.out.println(lessThanTen);
    }
}
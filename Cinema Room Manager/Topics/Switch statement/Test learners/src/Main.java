import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Yes!");
        } else if (number >= 2 && number <= 4) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}
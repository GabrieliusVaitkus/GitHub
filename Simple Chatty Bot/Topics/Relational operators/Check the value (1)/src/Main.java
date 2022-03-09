import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        boolean resultOne = numberOne > 0;
        boolean resultTwo = numberOne < 10;

        System.out.println(resultOne && resultTwo);

    }
}
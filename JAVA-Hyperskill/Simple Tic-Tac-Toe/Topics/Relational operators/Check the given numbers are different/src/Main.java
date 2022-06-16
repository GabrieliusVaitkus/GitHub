import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        boolean equalOne = numberOne != numberTwo;
        boolean equalTwo = numberOne != numberThree;
        boolean equalThree = numberTwo != numberThree;

        System.out.println(equalOne && equalTwo && equalThree);
    }
}
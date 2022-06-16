import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine();
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        numberTwo = numberTwo + 1;

        String strRange = wordOne.substring(numberOne, numberTwo);

        System.out.println(strRange);
    }
}
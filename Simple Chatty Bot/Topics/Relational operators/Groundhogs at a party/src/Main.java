import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCups = scanner.nextInt();
        boolean dayOfWeak = scanner.nextBoolean();

        boolean regularDay = numberOfCups >= 10 && numberOfCups <= 20 && !dayOfWeak;
        boolean weekendDay = numberOfCups >= 15 && numberOfCups <= 25 && dayOfWeak;
        boolean badParty = regularDay || weekendDay;

        System.out.println(badParty);

    }
}
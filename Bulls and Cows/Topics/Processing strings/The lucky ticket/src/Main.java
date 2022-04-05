import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split("");
        if (Integer.parseInt(number[0]) + Integer.parseInt(number[1]) + Integer.parseInt(number[2]) ==
                Integer.parseInt(number[3]) + Integer.parseInt(number[4]) + Integer.parseInt(number[5])) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
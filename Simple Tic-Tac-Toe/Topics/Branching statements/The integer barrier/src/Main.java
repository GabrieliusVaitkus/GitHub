import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        while (myScanner.hasNext()) {
            int input = myScanner.nextInt();
            sum += input;
            if (input == 0) {
                System.out.println(sum);
                break;
            } else if (sum == 1000 || sum > 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}
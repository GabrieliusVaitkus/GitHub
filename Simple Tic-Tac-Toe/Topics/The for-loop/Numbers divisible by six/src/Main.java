import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int inputs = 0;
        int sum = 0;

        for (int i = 0; i < elements; i++) {
            inputs = scanner.nextInt();
            if(inputs % 6 == 0) {
                sum += inputs;
            }
        }
        System.out.println(sum);
    }
}
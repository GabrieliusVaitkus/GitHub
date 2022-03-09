import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ascend = true;
        boolean descend = true;

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        if (input1 == 0) {
            System.out.println(true);
        }

        while (input2 != 0 && (ascend || descend)) {

            if (input1 < input2) {
                descend = false;
            }

            if (input1 > input2) {
                ascend = false;
            }

            input1 = input2;
            input2 = scanner.nextInt();
        }

        if (ascend || descend) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
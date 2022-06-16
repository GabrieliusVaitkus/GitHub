import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nr = scanner.nextLong();
        int i = 1;
        long total = 1L;

        while (true) {

            if(total <= nr) {
                total *= i;
                i++;
            }
            else {
                break;
            }
        }
        System.out.println(i - 1);

    }
}

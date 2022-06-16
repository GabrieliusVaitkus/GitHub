import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;

        System.out.println(result);
}
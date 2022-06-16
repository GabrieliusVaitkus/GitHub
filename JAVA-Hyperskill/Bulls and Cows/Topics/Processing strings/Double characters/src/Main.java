import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strPart = str.split("");
        for (int i = 0; i < strPart.length; i++) {
            System.out.print(strPart[i] + strPart[i]);
        }
    }
}
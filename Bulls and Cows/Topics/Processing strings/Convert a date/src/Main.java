import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] parts = input.split("-");

        System.out.print(parts[1] + "/" + parts[2] + "/" + parts[0]);
    }
}

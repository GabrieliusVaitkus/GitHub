import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height; 
        int day;
        int night;
        
        height = scanner.nextInt();
        day = scanner.nextInt();
        night = scanner.nextInt(); 
        
        final int days = (height - night - 1) / (day - night) + 1;

        System.out.println(days);

    }
}

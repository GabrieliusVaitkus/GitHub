import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner myScanner = new java.util.Scanner(System.in);
        int b = myScanner.nextInt();
        int h = myScanner.nextInt();

        countAreaOfParallelogram(b, h);

}

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
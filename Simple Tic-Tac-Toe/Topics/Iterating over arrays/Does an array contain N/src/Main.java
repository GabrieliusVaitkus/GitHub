import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        boolean contains = false;
        for (int element : array){
            if (element == n){
                contains = true;
                break;
            }
        }
        System.out.println(contains);
    }
}
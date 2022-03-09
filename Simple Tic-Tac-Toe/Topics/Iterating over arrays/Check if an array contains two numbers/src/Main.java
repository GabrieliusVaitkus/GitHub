import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ifContains = false;
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < arraySize; i++){
            if (array[i] == n && array[i-1] == m || array[i] == m && array[i-1] == n){
                ifContains = true;
                break;
            }
        }
        System.out.println(ifContains);
    }
}
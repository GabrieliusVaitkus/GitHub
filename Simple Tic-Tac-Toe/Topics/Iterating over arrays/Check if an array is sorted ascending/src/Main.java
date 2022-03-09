import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i] > intArray[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}

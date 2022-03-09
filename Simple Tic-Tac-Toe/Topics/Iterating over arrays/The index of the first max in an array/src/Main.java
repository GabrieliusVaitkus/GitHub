import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++){
            array[i] = scanner.nextInt();
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
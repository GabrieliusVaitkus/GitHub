import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOne = scanner.nextLine();
        int[] digitOne = {0, 0, 0, 0};
        int output;

        if (numberOne.length() == 1) {
            digitOne[3] = Character.getNumericValue(numberOne.charAt(0));
        } else if (numberOne.length() == 2) {
            digitOne[2] = Character.getNumericValue(numberOne.charAt(0));
            digitOne[3] = Character.getNumericValue(numberOne.charAt(1));
        } else if (numberOne.length() == 3) {
            digitOne[1] = Character.getNumericValue(numberOne.charAt(0));
            digitOne[2] = Character.getNumericValue(numberOne.charAt(1));
            digitOne[3] = Character.getNumericValue(numberOne.charAt(2));
        } else if (numberOne.length() == 4) {
            digitOne[0] = Character.getNumericValue(numberOne.charAt(0));
            digitOne[1] = Character.getNumericValue(numberOne.charAt(1));
            digitOne[2] = Character.getNumericValue(numberOne.charAt(2));
            digitOne[3] = Character.getNumericValue(numberOne.charAt(3));
        } else {
            System.out.println("ERROR.");
        }

        if (digitOne[0] == digitOne[3] && digitOne[1] == digitOne[2]) {
            output = 1;
        } else {
            output = (int) (Math.random() * 50);
        }
        System.out.println(output);
    }
}
import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] array) {
        //get first element
        int first = array[0];
        //get last element
        int last = array[array.length - 1];
        //return new array
        int[] newarray = new int[2];
        newarray[0] = first;
        newarray[1] = last;
        return newarray;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}

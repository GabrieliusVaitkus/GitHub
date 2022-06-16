import java.lang.Math;
import java.util.Arrays;

class Main {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print(numbers.size());

        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        System.out.print(numbers.size());

        numbers.add(8);
        numbers.add(1);
        System.out.print(numbers.size());
    }
}
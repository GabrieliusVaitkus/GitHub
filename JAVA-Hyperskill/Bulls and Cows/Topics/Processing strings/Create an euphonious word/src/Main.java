import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final int MAX_SUBSTRING_LENGTH = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        List<String> substrings = Arrays.stream(string.split("[aeiouy]"))
                .filter(s -> s.length() > MAX_SUBSTRING_LENGTH)
                .collect(Collectors.toList());
        substrings.addAll(Arrays.stream(string.split("[bcdfghjklmnpqrstvwxz]"))
                .filter(s -> s.length() > MAX_SUBSTRING_LENGTH)
                .collect(Collectors.toList()));

        int min = 0;
        for (String sub : substrings) {
            min += sub.length() / MAX_SUBSTRING_LENGTH + sub.length() % MAX_SUBSTRING_LENGTH - 1;
        }

        System.out.println(min);
    }
}
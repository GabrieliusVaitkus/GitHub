import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        String searchedWord = "the";
        System.out.println(word.indexOf(searchedWord));
    }
}

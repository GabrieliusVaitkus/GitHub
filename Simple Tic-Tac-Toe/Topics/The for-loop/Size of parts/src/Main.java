import java.util.Scanner;

class Parts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perfect = 0;
        int fix = 0;
        int reject = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int detector = scanner.nextInt();

            if (detector == 0) {
                perfect++;
            } else if (detector > 0) {
                fix++;
            } else {
                reject++;
            }
        }
        System.out.println(perfect + " " + fix + " " + reject);
    }
}
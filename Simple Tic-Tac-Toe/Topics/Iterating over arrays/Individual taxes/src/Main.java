import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] incomes = new int[numberOfCompanies];
        double[] taxes = new double[numberOfCompanies];

        for(int i = 0; i < numberOfCompanies; i++){
            incomes[i] = scanner.nextInt();
        }

        double maxTax = 0;
        int index = 1;
        for(int i = 0; i < numberOfCompanies; i++){
            taxes[i] = scanner.nextDouble() / 100 * incomes[i];
            if(maxTax < taxes[i]){
                maxTax = taxes[i];
                index = i + 1;
            }
        }

        System.out.println(index);
    }
}
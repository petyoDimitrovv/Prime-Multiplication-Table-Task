import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //System.out.println(isPrimeChecker(n));
        List<Integer> primeNumberList = primeNumberList(n);
        for (Integer numb : primeNumberList) {
            System.out.println(numb);

        }

    }

    private static List<Integer> primeNumberList(int n) {
        List<Integer> primesList = new ArrayList<>();

        if (n == 0) {
            return primesList;
        }
        int i = 1;
        while (primesList.size() <= n) {
            if (isPrimeChecker(i)) {
                primesList.add(i);

            }
            i++;
        }
        return primesList;
    }


    private static boolean isPrimeChecker(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

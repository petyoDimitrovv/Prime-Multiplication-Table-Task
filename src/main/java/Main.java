import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //System.out.println(isPrimeChecker(n));
        List<Integer> primeNumberList = primeNumberList(n);
            Integer[][] matrix = multiplicationTableCreator(primeNumberList);

            for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
                for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }


        }



    private static List<Integer> primeNumberList(int n) {
        List<Integer> primesList = new ArrayList<>();

        if (n == 0) {
            return primesList;
        }

        int i = 1;
        while (primesList.size() < n) {
            if (isPrimeChecker(i)) {
                primesList.add(i);

            }
            i ++;
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

    private static Integer[][] multiplicationTableCreator(List<Integer> primeNumbers) {


        Integer[][] multiplicationTable = new Integer[primeNumbers.size() + 1][primeNumbers.size() + 1];


        for (int i = 0; i < primeNumbers.size(); i++) {
            multiplicationTable[0][i + 1] = primeNumbers.get(i);
            multiplicationTable[i + 1][0] = primeNumbers.get(i);
        }

        for (int a = 1; a < multiplicationTable.length; a++) {
            for (int b = 1; b < multiplicationTable[0].length; b++) {
                multiplicationTable[a][b] = multiplicationTable[0][a] * multiplicationTable[b][0];
            }
        }


        return multiplicationTable;

    }


}


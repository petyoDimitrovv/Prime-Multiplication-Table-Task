package MultiplicationTable;

import java.util.List;

 /**
 * Prints Multiplication table for the given list of primes.
 */


public class MultiplicationTableImpl implements MultiplicationTable {

    private List<Integer> primeList;

    public MultiplicationTableImpl() {
    }

    public MultiplicationTableImpl(List<Integer> primeList) {
        this.primeList = primeList;


    }
    /*
    Method that returns multiplication table as a String matrix and prints result ot the STDOUT.
     */
    public void printTable() {

        String[][] matrix = createMultiplicationMatrix(primeList);

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

    }

    /*
    Create multiplication matrix with the product of 'n' prime number.
    Used String to represent the first cell like ' '(empty space)
    The first loop create initial table of first row and column.
    Example:
    " "  2  3  5  7
     2
     3
     5
     7

     */
    public String[][] createMultiplicationMatrix(List<Integer> primeNumbers) {

        String[][] multiplicationTable = new String[primeNumbers.size() + 1][primeNumbers.size() + 1];


        for (int i = 0; i < primeNumbers.size(); i++) {
            multiplicationTable[0][i + 1] = String.valueOf(primeNumbers.get(i));
            multiplicationTable[i + 1][0] = String.valueOf(primeNumbers.get(i));
        }
        multiplicationTable[0][0] = " ";
        for (int i = 1; i < multiplicationTable.length; i++) {
            for (int j = 1; j < multiplicationTable[0].length; j++) {
                int result = Integer.parseInt(multiplicationTable[0][i]) * Integer.parseInt(multiplicationTable[j][0]);
                multiplicationTable[i][j] = String.valueOf(result);
            }
        }

        return multiplicationTable;

    }

}


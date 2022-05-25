package MultiplicationTable;

import java.util.List;

public class MultiplicationTableImpl implements MultiplicationTable {

    private List<Integer> primeList;

    public MultiplicationTableImpl(List<Integer> primeList) {
        this.primeList = primeList;
    }

    @Override
    public void print() {

        String[][] matrix = createMultiplicationMatrix(primeList);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
    private  String[][] createMultiplicationMatrix(List<Integer> primeNumbers) {

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


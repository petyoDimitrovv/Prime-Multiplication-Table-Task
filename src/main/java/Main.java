import MultiplicationTable.MultiplicationTable;
import MultiplicationTable.MultiplicationTableImpl;
import Numbers.EvenNumbers.EvenNumberImpl;
import Numbers.NumberGenerator;
import Numbers.OddNumbers.OddNumbersImp;
import Numbers.PrimeNumbers.PrimeNumbersImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, this is multiplication table creator!");
        System.out.println("Please choose between 1, 2 and 3 for odd, even or prime type of " +
                           "multiplication table, then insert your desired size below:");

        int menuChoice = Integer.parseInt(scanner.nextLine());

        try {

                int size = Integer.parseInt(scanner.nextLine());

                switch (menuChoice) {
                    case 1:
                        List<Integer> oddsList = generateOdds(size);
                        printTable(oddsList);
                        break;
                    case 2:
                        List<Integer> evenList = generateEvens(size);
                        printTable(evenList);
                        break;
                    case 3:
                        List<Integer> primesList = generatePrimes(size);
                        printTable(primesList);
                        break;
                    default:
                        System.out.println("Invalid menu option");

                }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("That was your multiplication table!");
        }


    }

    private static List<Integer> generateOdds(int odd) {

        NumberGenerator oddGenerator = new OddNumbersImp();

        return oddGenerator.generate(odd);
    }

    private static List<Integer> generatePrimes(int prime) {

        NumberGenerator primeGenerator = new PrimeNumbersImpl();

        return primeGenerator.generate(prime);

    }

    private static List<Integer> generateEvens(int even) {

        NumberGenerator evenGenerator = new EvenNumberImpl();

        return evenGenerator.generate(even);
    }

    private static void printTable(List<Integer> numbList) {

        MultiplicationTable mt = new MultiplicationTableImpl(numbList);

        mt.printTable();

    }

}

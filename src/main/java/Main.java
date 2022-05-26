import MultiplicationTable.MultiplicationTable;
import MultiplicationTable.MultiplicationTableImpl;
import Numbers.PrimeNumbersImpl;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, this is prime multiplication calculator!");
        System.out.println("Please insert your input below!");

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        try {

            List<Integer> primesList = generatePrimes(n);
            MultiplicationTable mt = new MultiplicationTableImpl(primesList);
            mt.printTable();

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.printf("That was a table of first %d prime digits!", n);
        }

    }


    private static List<Integer> generatePrimes(int n) {

        return new PrimeNumbersImpl().generate(n);

    }

}



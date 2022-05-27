package Numbers.PrimeNumbers;

import Numbers.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersImpl extends PrimeNumber {

    /*
    Method that generate the primeNumber list.
    Add number 2 at the beginning because 1 is not prime,
    and it start from index 3 for optimization.
    The index increment every time with 2 to avoid even numbers.
     */
    @Override
    public List<Integer> generate(int numb) {
        List<Integer> primes = new ArrayList<>();

        if (numb <= 0) {
            throw new IllegalArgumentException("Number should be positive integer");
        }

        int i = 3;
        primes.add(2);
        while (primes.size() < numb) {
            if (isPrime(i)) {
                primes.add(i);
            }
            i += 2;
        }

        return primes;
    }

    /*
    Method that validate given number as prime.
     */

    public boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

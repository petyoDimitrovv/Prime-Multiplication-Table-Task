package Prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeImpl implements Prime{
    @Override
    public List<Integer> primeList(int numb) {
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


    boolean isPrime(int n) {
        if(n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

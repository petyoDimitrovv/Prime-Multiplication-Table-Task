package Numbers;

import Numbers.PrimeNumbers.PrimeNumbersImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class primeNumbersImplTest {

    @Test
    public void Test_primeListShouldThrowExceptionOnNotPositiveInteger() throws Exception {
        try {
            new PrimeNumbersImpl().generate(0);
            fail("Fail");
        } catch (IllegalArgumentException ex) {
            assertEquals("Number should be positive integer", ex.getMessage());
        }
    }

    @Test
    public void Test_isPrimeMethodProcessingRightPrimeNumbers() {
        PrimeNumbersImpl primes = new PrimeNumbersImpl();
        assertEquals(true, primes.isPrime(2));
        assertEquals(true, primes.isPrime(11));
        assertEquals(false, primes.isPrime(6));
        assertEquals(false, primes.isPrime(120));
    }

}
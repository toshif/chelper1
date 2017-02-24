package utils.prime;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import utils.SieveOfEratosthenes;

/**
 */
public class PrimeCheck_MillerRabinTest {

    @Test
    public void testIsPrime() {
        boolean[] primeCheckArray = SieveOfEratosthenes.getPrimeCheckArray(1_000_000);
        for (int i = 0; i < primeCheckArray.length; i++) {
            Assert.assertEquals(primeCheckArray[i], PrimeCheck_MillerRabin.isPrime(i));
        }
    }

    @Test
    public void testIsPrime2() {
        Assert.assertTrue(PrimeCheck_MillerRabin.isPrime(2233552257757L));
    }


}

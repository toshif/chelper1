The number of prime numbers between 1 to i inclusive.

* i:10, num of primes:4, percentage:40.0%
* i:100, num of primes:25, percentage:25.0%
* i:1000, num of primes:168, percentage:16.8%
* i:10000, num of primes:1229, percentage:12.29%
* i:100000, num of primes:9592, percentage:9.592%
* i:1000000, num of primes:78498, percentage:7.8498%
* i:10000000, num of primes:664579, percentage:6.64579%

```java
    public static void main(String[] args) {
        int cnt = 0;
        boolean[] primes = SieveOfEratosthenes.getPrimeCheckArray(10000005);
        for (int i = 0; i < primes.length; i++) {
            if (primes[i])
                cnt++;

            if (i == 10 || i == 100 || i == 1000 || i == 10_000 || i == 100_000 || i == 1000_000 || i == 10_000_000) {
                System.out.printf("i:%s, num of primes:%s, percentage:%s%%\n", i, cnt, (100.0 * cnt / i));
            }
        }
    }
```
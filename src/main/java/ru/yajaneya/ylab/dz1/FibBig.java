package ru.yajaneya.ylab.dz1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibBig {

    List<BigInteger> cache;

    public FibBig() {
        this.cache = new ArrayList<>();
        cache.add(0,BigInteger.ZERO);
        cache.add(1,BigInteger.ONE);
    }

    public BigInteger fib (int n) throws Exception{

        if (n<0) {
            throw new Exception("Числа Фибоначчи строятся только для n >= 0");
        }

        if (n < cache.size()) {
            return cache.get(n);
        } else {
            return addToCache(n);
        }
    }

    private BigInteger addToCache(int n) {
        for (int i = cache.size(); i<=n; i++) {
            cache.add(cache.get(i-1).add(cache.get(i-2)));
        }
        return cache.get(n);
    }

}

package ru.yajaneya.ylab.dz1;

import java.util.ArrayList;
import java.util.List;

public class Fib {

    List<Long> cache;

    public Fib() {
        this.cache = new ArrayList<>();
        cache.add(0,0l);
        cache.add(1,1l);
    }

    public long fib (int n) throws Exception{

        if (n<0) {
            throw new Exception("Числа Фибоначчи строятся только для n >= 0");
        }
        if (n>92) {
            throw new Exception("Эта программа расчитана на n от 0 до 92");
        }
        if (n <= 1) return n;

        if (n < cache.size()) {
            return cache.get(n);
        } else {
            return addToCache(n);
        }
    }

    private long addToCache(int n) {
        for (int i = cache.size(); i<=n; i++) {
            cache.add(cache.get(i-1) + cache.get(i-2));
        }
        return cache.get(n);
    }

}

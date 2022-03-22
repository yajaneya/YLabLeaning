/*
Доп задание: реализовать алгоритм поиска числа Фибоначчи
// 0 1 1 2 3 5 8 . . .
1 Рекурсивную реализацию
2 В цикле - с использовнием памяти
3 Сокращаем использование памяти, и алгоритм работает
 */

/*
Для увеличения номера искомого числа Фибоначчи тип возвращаемго функцией значения был изменен на long
 */

package ru.yajaneya.ylab.dz1;

import java.util.Date;

public class Fibonachchi {

    public static void main(String[] args) throws Exception{

        int n = 44; // номер искомого числа Фибоначчи

        testCacheInClassBigData(n);
        testCacheInClass(n);
        testOptMemoryCycle(n);
        testCycle(n);
        testRecurs(n);

    }

    // 1. Рекурсивная реализация
    private static long recursFib (int n) throws Exception{

        if (n<0) {
            throw new Exception("Числа Фибоначчи строятся только для n >= 0");
        }
        if (n>92) {
            throw new Exception("Эта программа расчитана на n от 0 до 92");
        }
        if (n <= 1) return n;

        return recursFib(n-1 ) + recursFib(n-2);

    }

    // 2. В цикле - с использованием памяти
    private static long cycleFib (int n) throws Exception{

        if (n<0) {
            throw new Exception("Числа Фибоначчи строятся только для n >= 0");
        }
        if (n>92) {
            throw new Exception("Эта программа расчитана на n от 0 до 92");
        }
        if (n <= 1) return n;

        long [] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i=2; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];

    }

    // 3. Сокращаем использование памяти, и алгоритм работает
    private static long optMemCycleFib (int n) throws Exception{

        if (n<0) {
            throw new Exception("Числа Фибоначчи строятся только для n >= 0");
        }
        if (n>92) {
            throw new Exception("Эта программа расчитана на n от 0 до 92");
        }
        if (n <= 1) return n;

        long [] fib = new long[3];
        fib[1] = 1;
        fib[2] = 1;
        for (int i=2; i<=n; i++) {
            fib[2] = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = fib[2];
        }
        return fib[2];

    }

    private static void testRecurs(int n) throws Exception {

        long timeStart, timeEnd, timePeriod;

        // Рекурсивный
        timeStart = new Date().getTime();
        System.out.println("-------");
        System.out.println("n = " + n + ", fibRecurs = " + recursFib(n));
        timeEnd = new Date().getTime();
        timePeriod = (timeEnd-timeStart);
        System.out.println("Формирование прошло за " + timePeriod + " мсек.");
        System.out.println("-------");

    }

    private static void testCycle(int n) throws Exception {

        long timeStart, timeEnd, timePeriod;

        //Цикл
        timeStart = new Date().getTime();
        System.out.println("-------");
        System.out.println("n = " + n + ", fibCycle " + cycleFib(n));
        timeEnd = new Date().getTime();
        timePeriod = (timeEnd-timeStart);
        System.out.println("Формирование прошло за " + timePeriod + " мсек.");
        System.out.println("-------");

    }

    private static void testOptMemoryCycle(int n) throws Exception {

        long timeStart, timeEnd, timePeriod;

        //Сокращаем использование памяти
        timeStart = new Date().getTime();
        System.out.println("-------");
        System.out.println("n = " + n + ", optMemory " + optMemCycleFib(n));
        timeEnd = new Date().getTime();
        timePeriod = (timeEnd-timeStart);
        System.out.println("Формирование прошло за " + timePeriod + " мсек.");
        System.out.println("-------");

    }

    private static void testCacheInClass(int n) throws Exception {

        long timeStart, timeEnd, timePeriod;

        //Использование кеш-структуры в отдельном классе
        Fib fib = new Fib();
        timeStart = new Date().getTime();
        System.out.println("-------");
        System.out.println("n = " + n + ", cacheInClass " + fib.fib(n));
        timeEnd = new Date().getTime();
        timePeriod = (timeEnd-timeStart);
        System.out.println("Формирование прошло за " + timePeriod + " мсек.");
        System.out.println("-------");

    }

    private static void testCacheInClassBigData(int n) throws Exception {

        long timeStart, timeEnd, timePeriod;

        //Использование кеш-струткуры в отдельном классе для больших чисел
        FibBig fibBig = new FibBig();
        timeStart = new Date().getTime();
        System.out.println("-------");
        System.out.println("n = " + n + ", cacheInClass " + fibBig.fib(n));
        timeEnd = new Date().getTime();
        timePeriod = (timeEnd-timeStart);
        System.out.println("Формирование прошло за " + timePeriod + " мсек.");
        System.out.println("-------");

    }

}

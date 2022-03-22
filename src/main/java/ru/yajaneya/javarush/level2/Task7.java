/*
Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.

Максимум двух чисел
Написать функцию, которая вычисляет максимум из двух чисел.

Минимум трёх чисел
Написать функцию, которая вычисляет минимум из трёх чисел.

Минимум четырёх чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */

package ru.yajaneya.javarush.level2;

public class Task7 {

    public static void main(String[] args) {
        System.out.println(minTwoNumber(5, 6));
        System.out.println(maxTwoNumber(5, 6));
        System.out.println(minThreeNumber(5, 6, 3));
        System.out.println(minFourNumber(5, 6, 3, 12));
    }

    private static int minTwoNumber (int a, int b) {
        return Math.min(a, b);
    }

    private static int maxTwoNumber (int a, int b) {
        return Math.max(a, b);
    }

    private static int minThreeNumber (int a, int b, int c) {
        int d = minTwoNumber(a,b);
        return Math.min(c, d);
    }

    private static int minFourNumber (int a, int b, int c, int d) {
        int e = minThreeNumber(a,b,c);
        return Math.min(d, e);
    }

}

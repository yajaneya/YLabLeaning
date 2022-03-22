/*
2. 10 чисел наоборот

Вывести на экран числа от 10 до 1, используя цикл while.
 */

package ru.yajaneya.javarush.level4;

public class Task13 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i--);
        }
    }
}

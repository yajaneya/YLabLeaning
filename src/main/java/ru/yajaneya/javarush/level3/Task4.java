/*
Произведение 10 чисел

Вывести на экран произведение чисел от 1 до 10.
Подсказка: будет три миллиона с хвостиком
 */

package ru.yajaneya.javarush.level3;

public class Task4 {
    public static void main(String[] args) {
        int rez = 1;
        for (int i=1; i<=10; i++) {
            rez *=i;
        }
        System.out.println(rez);
    }
}

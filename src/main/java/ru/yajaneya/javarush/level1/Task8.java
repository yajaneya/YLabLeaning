/*
Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.
 */

package ru.yajaneya.javarush.level1;

public class Task8 {
    private static String message = "Слава Роботам! Убить всех человеков!";
    private static int n = 16;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}

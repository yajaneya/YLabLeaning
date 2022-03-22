/*
4. S-квадрат

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
 */

package ru.yajaneya.javarush.level4;

public class Task15 {
    public static void main(String[] args) {
        int g = 0, v = 0;
        while (v++ < 10) {
            while (g++ < 10) {
                System.out.print("S");
            }
            System.out.println();
            g = 0;
        }
    }
}

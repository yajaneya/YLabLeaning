/*
2. Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника: ");
        int m = scanner.nextInt();
        System.out.println("Введите длину прямоугольника: ");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

/*
3. Рисуем треугольник

Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример:
8
88
888
...
 */

package ru.yajaneya.javarush.level4;

public class Task19 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

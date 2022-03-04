/*
4. Рисуем линии

Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
 */

package ru.yajaneya.javarush.level4;

public class Task20 {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            System.out.print("8");
        }
        System.out.println();
        System.out.println();
        for (int i=0; i < 10; i++) {
            System.out.println("8");
        }
    }
}

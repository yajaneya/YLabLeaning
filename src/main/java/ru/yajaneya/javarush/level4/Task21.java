/*
5. Все любят Мамбу

Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]

Пример текста:
Света любит меня.
Света любит меня.
…
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}

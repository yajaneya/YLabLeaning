/*
Зарплата через 5 лет

Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.

Пример:
Коля получает 3000 через 5 лет.
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите число: ");
        int salary = scanner.nextInt();
        System.out.print("Введите число: ");
        int numYears = scanner.nextInt();
        System.out.println();
        System.out.println(name + " получает " + salary + " через " + numYears + " лет.");
    }
}

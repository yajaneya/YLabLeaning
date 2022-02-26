/*
Скромность украшает человека

Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}

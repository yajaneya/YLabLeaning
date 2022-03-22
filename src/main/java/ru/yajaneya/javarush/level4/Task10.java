/*
Задача 5. 18+

Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String  name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}

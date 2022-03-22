/*
3. Хорошего не бывает много

Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.

Пример ввода:
абв
2
Пример вывода:
абв
абв
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        while (n-- > 0) {
            System.out.println(str);

        }
    }
}

/*
5. Вводить с клавиатуры числа и считать их сумму

Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
 */

package ru.yajaneya.javarush.level5.task20;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String ch;
        System.out.print("Введите число: ");
        while (!(ch = scanner.nextLine()).equals("сумма")) {
            try {
                int s = Integer.parseInt(ch);
                sum += s;
            } catch (NumberFormatException e){
                continue;
            } finally {
                System.out.print("Введите число: ");
            }
        }
        System.out.println("Сумма: " + sum);
    }
}

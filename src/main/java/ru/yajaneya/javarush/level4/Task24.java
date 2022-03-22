/*
3. Посчитать сумму чисел

Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму
и завершить программу. -1 должно учитываться в сумме.
 */

package ru.yajaneya.javarush.level4;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Введите число: ");
            a = scanner.nextInt();
            sum += a;
        } while (a != -1);
        System.out.println(sum);
    }
}

/*
Как захватить мир

Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
( Последовательность вводимых данных имеет большое значение.)

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numYears = scanner.nextInt();
        System.out.print("Введите имя: ");
        String name;
        while ((name = scanner.nextLine()).equals("")) { } // защита от дребезга клавиши Enter
        System.out.println();
        System.out.println(name + " захватит мир через " + numYears + " лет. Му-ха-ха!");
    }
}

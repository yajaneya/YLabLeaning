/*
Спонсор - это звучит гордо

Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.

Пример:
Коля проспонсировал Лену, и она стала известной певицей.
 */

package ru.yajaneya.javarush.level3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя: ");
        String name2 = scanner.nextLine();
        System.out.println();
        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }
}

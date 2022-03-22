/*
Таблица умножения

Выведи на экран таблицу умножения 10 на 10 в следующем виде:

1 2 3 …
2 4 6 …
3 6 9 …
…
Для сложности: внутри метода print/println должны фигурировать только переменные.
 */

package ru.yajaneya.javarush.level3;

public class Task7 {
    public static void main(String[] args) {
        String separator = " ";
        String enter = "\n";
        for (int i=1; i<11; i++) {
            for (int j=1; j<11; j++) {
                System.out.print(i*j + separator);
            }
            System.out.print(enter);
        }
    }
}

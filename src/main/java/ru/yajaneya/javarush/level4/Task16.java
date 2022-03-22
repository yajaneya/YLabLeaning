/*
5. Таблица умноження

Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

Example output:
1	2	3	 4	 5	 6	 7	 8	 9	10
2	4	6	 8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
...

 */

package ru.yajaneya.javarush.level4;

public class Task16 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i++ < 10) {
            while (j++ < 10) {
                int u = i*j;
                System.out.print(u);
                if (u < 10) {
                    System.out.print("   ");
                } else if (u < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            j = 0;
        }
    }
}

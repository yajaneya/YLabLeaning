/*
Сумма 10 чисел

Вывести на экран сумму чисел от 1 до 10 построчно:
1
1+2=3
1+2+3=6
1+2+3+4=10
…
Пример вывода:
1
3
6
10
…
 */

package ru.yajaneya.javarush.level3;

public class Task5 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            int sum = 1;
            System.out.print("1");
            for (int j=2; j<=i; j++) {
                System.out.print("+" + j);
                sum+=j;
            }
            if (sum>1){
                System.out.println("="+sum);
            } else {
                System.out.println();
            }

        }
    }
}

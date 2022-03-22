/*
4. Вывести на экран сегодняшнюю дату

Вывести на экран текущую дату в аналогичном виде «21 06 2015».
 */

package ru.yajaneya.javarush.level5.task19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(
                new SimpleDateFormat("dd MM yyyy").format(new Date())
        );
    }

}

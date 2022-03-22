/*
 Интерфейс, позволяющий подставлять различные варианты обозначения
 координат для хода игрока для xml-файла
 */

package ru.yajaneya.ylab.dz2.Parser.pozitionAdapter;

public interface PozitionAdapter {
    int[] getPozition (String content);
}

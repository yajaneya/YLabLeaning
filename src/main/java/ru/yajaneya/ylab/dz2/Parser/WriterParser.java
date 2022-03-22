/*
Интерфейс, описывающий API для создания и заполнения xml-файла
данными об прошедших играх двух игроков до выхода из программы.
 */

package ru.yajaneya.ylab.dz2.Parser;

import ru.yajaneya.ylab.dz2.models.Player;

public interface WriterParser {

    boolean init(String name1, String name2);
    boolean startGame(Player player1, Player player2);
    boolean stepGame(Player player, int x, int y);
    boolean endGame(Player player);
}

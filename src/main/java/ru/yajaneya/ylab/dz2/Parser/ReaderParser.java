/*
Интерфейс, описывающий API для чтения из xml-файла
данных об прошедших играх двух игроков.
 */

package ru.yajaneya.ylab.dz2.Parser;

import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.models.Step;

import java.io.File;
import java.util.List;

public interface ReaderParser {
    boolean init(File file);
    List<Player> getPlayers ();
    List<Step> getSteps();
    Player getResult();
}

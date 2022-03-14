/*
Интерфейс, описывающий API для чтения из xml-файла
данных об прошедших играх двух игроков.
 */

package ru.yajaneya.ylab.dz2.xmlParser;

import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.models.Step;

import java.util.List;

public interface ReaderXml {
    boolean init();
    List<Player> getPlayers ();
    List<Step> getSteps();
    Player getResult();
}

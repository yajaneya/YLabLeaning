/*
Класс для воспроизведения хода игры, записанной в xml-файл.
По умолчанию открывается каталог хранения файлов,
записанной игры "arhiv" в корневой директории проекта.
Однако, при запуске дается возможность выбрать файл из любого места хранения,
доступного на текущем компьютере
 */

package ru.yajaneya.ylab.dz2;

import ru.yajaneya.ylab.dz2.fabrics.HistoryFabric;
import ru.yajaneya.ylab.dz2.models.Field;
import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.models.Step;
import ru.yajaneya.ylab.dz2.Parser.ReaderParser;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class GameViewer {
    private static File file; // задается имя файла

    public static void main(String[] args) {

        JFileChooser fileopen = new JFileChooser("./arhiv/");
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
           file = fileopen.getSelectedFile();
            System.out.println(file.getPath());
        }

        ReaderParser readerParser = new HistoryFabric().getReadParser(); //устанавливается парсес чтения
        if (!readerParser.init(file)) return;
        List<Player> players = readerParser.getPlayers();
        List<Step> steps = readerParser.getSteps();
        if (steps == null) {
            return;
        }
        Player winPlayer = readerParser.getResult();
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        System.out.println("Игрок №" + player1.getId() + ": " + player1.getName()
                        + ", символ: " + player1.getSymbol());
        System.out.println("Игрок №" + player2.getId() + ": " + player2.getName()
                        + ", символ: " + player2.getSymbol());
        System.out.println("-----------------");
        System.out.println("*** ХОД ИГРЫ ***");
        System.out.println("-----------------");
        Field field = new Field();
        field.init();
        field.draw();
        for (Step step : steps) {
            field.move(
                    getPlayerById(players, step.getPlayerId()),
                    step.getX(),
                    step.getY()
            );
            field.draw();
        }
        System.out.println("**********************");
        System.out.println("*** РЕЗУЛЬТАТ ИГРЫ ***");
        System.out.println("**********************");
        if (winPlayer == null) {
            System.out.println("НИЧЬЯ!!!");
        } else {
            System.out.println("Победитель: " + winPlayer.getName());
        }

    }

    private static Player getPlayerById (List<Player> players, int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }
}

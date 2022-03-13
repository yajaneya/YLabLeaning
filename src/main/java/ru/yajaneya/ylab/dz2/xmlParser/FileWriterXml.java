/*
Этот класс предоставляет API для создания и заполнения xml-файла
данными об прошедших играх двух игроков до выхода из программы.
Класс выполнен средствами записи в файл.
Файлы именуются в виде game[X].xml, где X - номер партии в игре.
Например, game1.xml
При каждом входе в программу отчест партий идет сначала.
 */

package ru.yajaneya.ylab.dz2.xmlParser;

import ru.yajaneya.ylab.dz2.Player;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterXml implements WriterXml{
    private String outFile;
    private FileWriter fileWriter;
    private int step;


    public FileWriterXml(String outFile) {
        this.outFile = outFile;
        step = 1;
    }

    public boolean startGame(Player player1, Player player2) {
        try {
            fileWriter = new FileWriter("." + File.separator + outFile); //TODO Реализовать наименование файла в виде gameNamePlayer1NamePlayer2NumberGame.xml
            writeToFile("<?xml version=\"1.0\" encoding=\"windows-1251\"?>");
            writeToFile("<Gameplay>");
            writeToFile("   <Player id=\"" + player1.getId() + "\" name=\"" + player1.getName()
                    + "\" symbol=\"" + player1.getSymbol() + "\"/>");
            writeToFile("   <Player id=\"" + player2.getId() + "\" name=\"" + player2.getName()
                    + "\" symbol=\"" + player2.getSymbol() + "\"/>");
            writeToFile("   <Game>");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean stepGame(Player player, int x, int y) {
        try {
            writeToFile("       <Step num=\"" + step++ + "\" playerId=\"" + player.getId()
                    + "\">" + x + "," + y + "</Step>");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean endGame(Player player) {
        try {
            writeToFile("   </Game>");
            if (player == null) {
                writeToFile("   <GameResult>Draw!</GameResult>");
            } else {
                writeToFile("   <GameResult><Player id=\"" + player.getId()
                        + "\" name=\"" + player.getName() + "\" symbol=\""
                        + player.getSymbol() + "\"/></GameResult>");
            }
            writeToFile("</Gameplay>");
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private void writeToFile (String line) throws IOException{
        fileWriter.write(line + "\n");
    }

}

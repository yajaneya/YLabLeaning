/*
Этот класс предоставляет API для создания и заполнения xml-файла
данными о прошедших играх двух игроков до выхода из программы.
Класс выполнен средствами записи в файл.
Файлы именуются в виде game[X].xml, где X - номер партии в игре.
Например, game1.xml
При каждом входе в программу отчест партий идет сначала.
 */

package ru.yajaneya.ylab.dz2.xmlParser;

import ru.yajaneya.ylab.dz2.models.Player;

import java.io.*;

public class FileWriterXml implements WriterXml{
    private String outFile;
    private OutputStreamWriter fileWriter;
    private int step;


    public FileWriterXml(String outFile) {
        this.outFile = outFile;
        step = 1;
    }

    @Override
    public boolean init() {
        File folder = new File("." +
                File.separator + "arhiv");
        if (!folder.exists()) {
            folder.mkdir();
        }
        try {
            fileWriter = new OutputStreamWriter(new FileOutputStream(
                    "." + File.separator + "arhiv" + File.separator + outFile),
                    "windows-1251");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean startGame(Player player1, Player player2) {
        try {
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

    @Override
    public boolean stepGame(Player player, int x, int y) {
        try {
            writeToFile("       <Step num=\"" + step++ + "\" playerId=\"" + player.getId()
                    + "\">" + x + "," + y + "</Step>");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
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


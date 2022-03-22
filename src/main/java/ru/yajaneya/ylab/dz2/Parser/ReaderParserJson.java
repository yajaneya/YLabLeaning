/*
    Реализация парсера для чтения json-файла
    Этот класс предоставляет API для чтения из json-файла
    данных о прошедших играх.
 */


package ru.yajaneya.ylab.dz2.Parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.yajaneya.ylab.dz2.models.JsonGamePlay;
import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.models.Step;

import java.io.*;
import java.util.List;

public class ReaderParserJson implements ReaderParser{
    private File file;
    private String jsonStr;
    private JsonGamePlay jsonGamePlay;

    @Override
    public boolean init(File file) {
        this.file = file;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "windows-1251");
            BufferedReader fileReader = new BufferedReader(inputStreamReader);
            String line = "";
            jsonStr = "";
            while ((line = fileReader.readLine()) != null) {
                jsonStr += line;
            }
            ObjectMapper mapper = new ObjectMapper();
            jsonGamePlay = new JsonGamePlay();
            jsonGamePlay = mapper.readValue(jsonStr, JsonGamePlay.class);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public List<Player> getPlayers() {
        return jsonGamePlay.getGameplay().getPlayers();
    }

    @Override
    public List<Step> getSteps() {
        return jsonGamePlay.getGameplay().getGame().getSteps();
    }

    @Override
    public Player getResult() {
        return jsonGamePlay.getGameplay().getGameResult().getPlayerWin();
    }
}

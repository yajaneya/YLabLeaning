/*
Работа с координатами в виде x,y
 */

package ru.yajaneya.ylab.dz2.Parser.pozitionAdapter;

public class PozitionOne implements PozitionAdapter{

    @Override
    public int[] getPozition(String content) {
        String[] parse = content.split(",");
        int [] rezult = new int[2];
        rezult [0] = Integer.parseInt(parse[0]);
        rezult [1] = Integer.parseInt(parse[1]);
        return rezult;
    }
}

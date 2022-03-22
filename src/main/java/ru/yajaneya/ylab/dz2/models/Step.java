/*
 Класс, описывающий ход (шаг) игры
 */

package ru.yajaneya.ylab.dz2.models;

public class Step {
    private int number; // номер хода
    private int playerId; // id игрока
    private int x; // номер строки хода
    private int y; // номер столбца хода

    public Step(int number, int playerId, int x, int y) {
        this.number = number;
        this.playerId = playerId;
        this.x = x;
        this.y = y;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Step{" +
                "number=" + number +
                ", playerId=" + playerId +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

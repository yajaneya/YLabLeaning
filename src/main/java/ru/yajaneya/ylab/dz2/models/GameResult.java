package ru.yajaneya.ylab.dz2.models;

public class GameResult {
    private Player playerWin;

    public GameResult(Player playerWin) {
        this.playerWin = playerWin;
    }

    public GameResult() {
    }

    public Player getPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(Player playerWin) {
        this.playerWin = playerWin;
    }
}

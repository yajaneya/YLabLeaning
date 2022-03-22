package ru.yajaneya.ylab.dz2.models;

public class JsonGamePlay {
    Gameplay gameplay;

    public JsonGamePlay() {
    }

    public JsonGamePlay(Gameplay gameplay) {
        this.gameplay = gameplay;
    }

    public Gameplay getGameplay() {
        return gameplay;
    }

    public void setGameplay(Gameplay gameplay) {
        this.gameplay = gameplay;
    }

}

package ru.yajaneya.ylab.dz2.models;

import java.util.List;

public class Game {
    private List<Step> steps;

    public Game(List<Step> steps) {
        this.steps = steps;
    }

    public Game() {
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}

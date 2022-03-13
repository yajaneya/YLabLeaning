package ru.yajaneya.ylab.dz2;

import java.io.Serializable;
import java.util.Comparator;

public class Player {
    private int id;
    private String name;
    private char symbol;
    private int rating;


    public Player(int id, String name, char symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public Player(int rating, String name) {
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static final Comparator<Player> COMPARE_BY_RATING = (lhs, rhs) -> rhs.getRating() - lhs.getRating();
}

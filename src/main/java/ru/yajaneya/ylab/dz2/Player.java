package ru.yajaneya.ylab.dz2;

import java.io.Serializable;
import java.util.Comparator;

public class Player {
    private String name;
    private char symbol;
    private int rating;


    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Player(int rating, String name) {
        this.name = name;
        this.rating = rating;
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

    public static final Comparator<Player> COMPARE_BY_RATING = new Comparator<Player>() {
        @Override
        public int compare(Player lhs, Player rhs) {
            return rhs.getRating() - lhs.getRating();
        }
    };
}

/*
Класс, описывающий игрока игры "Крестики-нолики"
 */

package ru.yajaneya.ylab.dz2;

import java.util.Comparator;

public class Player {
    private int id; // идентификатор игрока
    private String name; // имя игрока
    private char symbol; // символ, который ставит игрок на поле
    private int rating; // рейтинг игрока -> отражает количество выигранных партий.


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

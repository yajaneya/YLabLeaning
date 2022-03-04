/*
В связи с отсутвием класса Duck создаю по своему усмотрению
 */

package ru.yajaneya.javarush.level5.task16;

public class Duck {
    private String kind;

    public Duck (String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Утка вида " + kind;
    }
}

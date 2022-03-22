/*
Семь цветов радуги

Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
Каждый объект при создании выводит на экран определенный цвет.
Для сложности: внутри метода print/println должны фигурировать только переменные.
 */

package ru.yajaneya.javarush.level3;

public class Task8 {
    public static void main(String[] args) {
        RainbowColor rainbowColorR = new RainbowColor("R");
        RainbowColor rainbowColorO = new RainbowColor("O");
        RainbowColor rainbowColorY = new RainbowColor("Y");
        RainbowColor rainbowColorG = new RainbowColor("G");
        RainbowColor rainbowColorB = new RainbowColor("B");
        RainbowColor rainbowColorI = new RainbowColor("I");
        RainbowColor rainbowColorV = new RainbowColor("V");
    }
}

class RainbowColor {
    private String color;

    public RainbowColor(String color) {
        System.out.print(color);
    }
}

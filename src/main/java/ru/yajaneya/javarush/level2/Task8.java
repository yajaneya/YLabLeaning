/*
Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.

Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
 */

package ru.yajaneya.javarush.level2;

import javax.swing.*;
import java.awt.*;

public class Task8 extends JFrame {
    private String string;
    private LayoutManager layoutManager;

    public static void main(String[] args) {
        duplicateVertString("Вертикаль");
        duplicateGorString("Горизонталь ");
    }

    public Task8(String string, int box, int x, int y) {
        super("Screen");
        setLocation(x, y);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel message = new JLabel(string);
        JLabel message1 = new JLabel(string);
        JLabel message2 = new JLabel(string);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,box));
        panel.add(message);
        panel.add(message1);
        panel.add(message2);
        add(panel);
    }

    public static void duplicateVertString(String string) {
        Task8 screen = new Task8(string, BoxLayout.Y_AXIS, 100, 100);
        screen.setVisible(true);
        System.out.println(string + "\n" + string + "\n" + string);
    }

    public static void duplicateGorString(String string) {
        Task8 screen = new Task8(string, BoxLayout.X_AXIS,100, 300);
        screen.setVisible(true);
        System.out.println(string + " " + string + " " + string);
    }


}


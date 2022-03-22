/*
Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».
 */

package ru.yajaneya.javarush.level2;

import javax.swing.*;

public class Task3 extends JFrame {
    public static void main(String[] args) {
        Task3 screen = new Task3();
        screen.setVisible(true);
        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");
    }

    public Task3() {
        super("Screen");
        setLocationRelativeTo(null);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel message = new JLabel("Мне так плохо! Хочу, чтобы все умерли!");
        JPanel panel = new JPanel();
        panel.add(message);
        add(panel);
    }

}


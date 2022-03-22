/*
Новое задание: написать программу, которая выводит на экран строки:
Меня зовут Амиго.

Я согласен на зарплату $800/месяц в первый год.
Я согласен на зарплату $1500/месяц во второй год.
Я согласен на зарплату $2200/месяц в третий год.
Я согласен на зарплату $2700/месяц в четвертый год.
Я согласен на зарплату $3200/месяц в пятый год.

Поцелуй мой блестящий металлический зад!
 */

package ru.yajaneya.javarush.level1;

import javax.swing.*;

public class Task5 extends JFrame{
    public static void main(String[] args) {
        Task5 screen = new Task5();
        screen.setVisible(true);

        System.out.println("Меня зовут Амиго.");
        System.out.println();
        System.out.println("Я согласен на зарплату $800/месяц в первый год.");
        System.out.println("Я согласен на зарплату $1500/месяц во второй год.");
        System.out.println("Я согласен на зарплату $2200/месяц в третий год.");
        System.out.println("Я согласен на зарплату $2700/месяц в четвертый год.");
        System.out.println("Я согласен на зарплату $3200/месяц в пятый год.");
        System.out.println();
        System.out.println("Поцелуй мой блестящий металлический зад!");
    }

    public Task5 () {
        super("Screen");
        setLocationRelativeTo(null);
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel [] str = new JLabel[9];
        str[0] = new JLabel("Меня зовут Амиго.");
        str[1] = new JLabel(" ");
        str[2] = new JLabel("Я согласен на зарплату $800/месяц в первый год.");
        str[3] = new JLabel("Я согласен на зарплату $1500/месяц во второй год.");
        str[4] = new JLabel("Я согласен на зарплату $2200/месяц в третий год.");
        str[5] = new JLabel("Я согласен на зарплату $2700/месяц в четвертый год.");
        str[6] = new JLabel("Я согласен на зарплату $3200/месяц в пятый год.");
        str[7] = new JLabel(" ");
        str[8] = new JLabel("Поцелуй мой блестящий металлический зад!");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        for (JLabel label : str) {
            panel.add(label);
        }

        add(panel);
    }

}

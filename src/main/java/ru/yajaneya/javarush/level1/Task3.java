/*
Раскоментируйте часть кода, чтобы на экран вывелось сообщение "Happy New Year"
 */

/*
 Так как кода в данном задании не предоставлено, пишу код с нуля.
 */

package ru.yajaneya.javarush.level1;

import javax.swing.*;

public class Task3 extends JFrame {
    public static void main(String[] args) {
        Task3 screen = new Task3();
        screen.setVisible(true);

        System.out.println("Happy New Year");
    }

    public Task3 () {
        super("Screen");
        setLocationRelativeTo(null);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel message = new JLabel("Happy New Year");
        JPanel panel = new JPanel();
        panel.add(message);
        add(panel);
    }

}


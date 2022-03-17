/*
Дополнительное задание:

Реализовать простую игру крестики-нолики с вводом с клавиатуры
Через ввод с клавиатуры вводим имена игроков
Имеется матрица 3 x 3 - игровое поле,
| - | - | - |
| - | - | - |
| - | - | - |
два игрока, по очереди совершают ход, на каждом шаге происходит проверка на победителя,
и предложение сыграть еще раз!
1ый игрок всегда X(крестик), 2ой игрок 0(нолик)
| - | - | 0 |
| - | x | - |
| x | - | 0 |
Вести рейтинг участников в файле.
 */



package ru.yajaneya.ylab.dz2;

import ru.yajaneya.ylab.dz2.models.Field;
import ru.yajaneya.ylab.dz2.models.Player;
import ru.yajaneya.ylab.dz2.xmlParser.FileWriterXml;
import ru.yajaneya.ylab.dz2.xmlParser.WriterXml;

import java.util.Scanner;

public class TicTacToe {
    private static int countGames = 1;
    private static Player player1;
    private static Player player2;
    private static WriterXml writerXml;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первый игрок, введите своё имя: ");
        player1 = new Player(1, scanner.nextLine(),'х');
        System.out.print("Второй игрок, введите своё имя: ");
        player2 = new Player(2, scanner.nextLine(), '0');
        startGameXml();
        Field field = new Field();

        while (true) {
            while (true) {
                field.draw();
                if (step(scanner, field, player1)) {
                    win(player1, field);
                    writerXml.endGame(player1);
                    break;
                }
                if (field.deadHeat()) {
                    deadHeat();
                    field.draw();
                    writerXml.endGame(null);
                    break;
                }
                field.draw();
                if (step(scanner, field, player2)) {
                    win(player2, field);
                    writerXml.endGame(player2);
                    break;
                }
                if (field.deadHeat()) {
                    deadHeat();
                    field.draw();
                    writerXml.endGame(null);
                    break;
                }
            }
            System.out.println();
            System.out.print("Сыграем ещё раз? (да/нет): ");
            String  answer = scanner.nextLine();
            while (!answer.equals("да") && !answer.equals("нет")) {
                answer = scanner.nextLine();
            }
            if (answer.equals("да")) {
                field.init();
                startGameXml();
                continue;
            }
            System.out.println("*****************");
            System.out.println("*-Конец игры!!!-*");
            System.out.println("*****************");
            break;
        }
    }

    private static void startGameXml () {
        writerXml = new FileWriterXml("game" + countGames++ + ".xml");
        writerXml.init();
        writerXml.startGame(player1, player2);
    }

    private static void deadHeat() {
        System.out.println("**************");
        System.out.println("*** НИЧЬЯ! ***");
        System.out.println("**************");
    }

    private static void win(Player player, Field field) {
        System.out.println("**** **** ****");
        System.out.println(player.getName() + " ПОБЕДИЛ !!!");
        System.out.println("**** **** ****");
        field.addToRating(player);
        field.draw();
        field.printRating();
    }

    private static boolean step (Scanner scanner, Field field, Player player) {
        System.out.println("--- --- ---");
        System.out.println(player.getName() + " ходит:");
        System.out.print("Введите координату x: ");
        int x = scanner.nextInt(); // TODO проверка на ввод символа
        System.out.print("Введите координату y: ");
        int y = scanner.nextInt(); // TODO проверка на ввод символа
        if (!field.move(player, x, y)) {
            System.out.println("Ячейка занята или лежит за пределами поля. Повторите ход...");
            step(scanner, field, player);
        } else {
            writerXml.stepGame(player, x, y);
        }
        return field.win(player);
    }

}

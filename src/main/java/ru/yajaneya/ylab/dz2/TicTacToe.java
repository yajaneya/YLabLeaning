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

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первый игрок, введите своё имя: ");
        Player player1 = new Player(scanner.nextLine(),'х');
        System.out.print("Второй игрок, введите своё имя: ");
        Player player2 = new Player(scanner.nextLine(), '0');
        Field field = new Field();

        while (true) {
            while (true) {
                field.draw();
                if (step(scanner, field, player1)) {
                    win(player1, field);
                    break;
                }
                field.draw();
                if (step(scanner, field, player2)) {
                    win(player2, field);
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
                continue;
            }
            System.out.println("*****************");
            System.out.println("*-Конец игры!!!-*");
            System.out.println("*****************");
            break;
        }
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
        int x = scanner.nextInt();
        System.out.print("Введите координату y: ");
        int y = scanner.nextInt();
        if (!field.move(player, x, y)) {
            System.out.println("Ячейка занята или лежит за пределами поля. Повторите ход...");
            step(scanner, field, player);
        }
        return field.win(player);
    }


}

/*
Экранирование символов

Про экранирование символов в Java читайте в дополнительном материале к лекции.
Вывести на экран следующий текст - две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
Для сложности: внутри метода print/println должны фигурировать только переменные.
 */

package ru.yajaneya.javarush.level3;

public class Task9 {
    public static void main(String[] args) {
        String string1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String string2 = "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";

        System.out.println(string1);
        System.out.println(string2);
    }
}

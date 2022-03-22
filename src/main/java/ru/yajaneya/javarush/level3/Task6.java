/*
Мама мыла раму

Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
...
Для сложности: внутри метода print/println должны фигурировать только переменные.
 */

package ru.yajaneya.javarush.level3;

public class Task6 {

    public static void main(String[] args) {
        String [] s = {"Мама", "Мыла", "Раму"};
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    if (i!=j & i!=k & j!=k) {
                        System.out.println(s[i]+s[j]+s[k]);
                    }
                }
            }
        }
    }

}

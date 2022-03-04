/*
2. Man and Woman

1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
 */

package ru.yajaneya.javarush.level5.task17;

public class Solution {

    public static void main(String[] args) {
        Man man1 = new Man("Василий", 25, "г.Улан-Уде, ул. Ленина, 14");
        Man man2 = new Man("Павел", 38, "г.Брес, ул. Ленина, 14");
        Woman woman1 = new Woman("Марфа", 18, "г.Москва, ул. Ленина, 14");
        Woman woman2 = new Woman("Ксения", 52, "г.Новосибирск, ул. Ленина, 14");
        System.out.println(man1);
        System.out.println(woman1);
        System.out.println(man2);
        System.out.println(woman2);
    }


    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}

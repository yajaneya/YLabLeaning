/*
3. Создай public static классы Dog, Cat.

Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
 */

package ru.yajaneya.javarush.level5.task18;

public class Task18 {
    public static void main(String[] args) {
        Cat tomCat = new Cat("Том", 5, 7);
        Cat georgeCat = new Cat("Джордж", 5, 7);
        Cat dupliCat = new Cat("Дупликот", 5, 7);
        Cat butchCat = new Cat("Бутч", 7, 6);
        Cat muffCat = new Cat("Мафф", 4, 3);
        Dog spikeDog = new Dog("Спайк", 21, 25);
        Dog bernardDog = new Dog("Бернард", 18, 20);
        Dog tykeDog = new Dog("Тайк", 2, 3);
    }

    public static class Dog {
        private String name;
        private int strength;
        private int weight;

        public Dog(String name, int strength, int weight) {
            this.name = name;
            this.strength = strength;
            this.weight = weight;
        }
    }

    public static class Cat {
        private String name;
        private int strength;
        private int weight;

        public Cat(String name, int strength, int weight) {
            this.name = name;
            this.strength = strength;
            this.weight = weight;
        }
    }


}

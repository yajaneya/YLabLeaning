/*
5. Создать класс прямоугольник (Rectangle)

Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */

package ru.yajaneya.javarush.level5.task10;

public class Task10 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.initialize(14f, 11.5f, 22.2f, 5f);
        System.out.println(rec1);
        Rectangle rec2 = new Rectangle();
        rec2.initialize(1f, 1.5f);
        System.out.println(rec2);
        Rectangle rec3 = new Rectangle();
        rec3.initialize(1.4f, 1.55f, 2.22f);
        System.out.println(rec3);
        Rectangle rec4 = new Rectangle();
        rec4.initialize(rec3);
        System.out.println(rec4);
        Rectangle rec5 = new Rectangle();
        rec5.initialize(7.3f);
        System.out.println(rec5);
    }
}

class Rectangle {
    private float top;
    private float left;
    private float width;
    private float height;

    public void initialize(float left, float top, float width, float height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(float left, float top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(float left, float top, float width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    //квадрат, у которого верхний левый угол в начале координат
    public void initialize(float width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", left=" + left +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

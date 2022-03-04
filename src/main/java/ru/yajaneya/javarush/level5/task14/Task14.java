/*
4. Создать класс Circle

Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */

package ru.yajaneya.javarush.level5.task14;

public class Task14 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.4f, 3.2f, 5.1f);
        System.out.println(circle1);
        Circle circle2 = new Circle(3.4f, 3.2f, 5.1f, 1f);
        System.out.println(circle2);
        Circle circle3 = new Circle(3.4f, 3.2f, 5.1f, 1f, "yellow");
        System.out.println(circle3);
    }
}

class Circle {
    private float centerX;
    private float centerY;
    private float radius;
    private float width;
    private String color;

    public Circle (float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle (float centerX, float centerY, float radius, float width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle (float centerX, float centerY, float radius, float width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}

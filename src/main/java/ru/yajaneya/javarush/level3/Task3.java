/*
StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
 */

package ru.yajaneya.javarush.level3;

public class Task3 {

    public static void main(String[] args) {
        Zerg zerg = new Zerg("Зерг");
        Zerg zorg = new Zerg("Зорг");
        Zerg zurg = new Zerg("Зург");
        Zerg zirg = new Zerg("Зирг");
        Zerg zarg = new Zerg("Зарг");
        Zerg zaerg = new Zerg("Заерг");
        Zerg zearg = new Zerg("Зеарг");
        Zerg zourg = new Zerg("Зоург");
        Zerg zyirg = new Zerg("Зюирг");
        Zerg zoeurg = new Zerg("Зоеург");
        Protos protos = new Protos("Протос");
        Protos pratos = new Protos("Пратос");
        Protos prutos = new Protos("Прутос");
        Protos pretos = new Protos("Претос");
        Protos pritos = new Protos("Притос");
        Terran terran = new Terran("Терран");
        Terran torran = new Terran("Торран");
        Terran tirran = new Terran("Тирран");
        Terran turran = new Terran("Турран");
        Terran tarran = new Terran("Тарран");
        Terran tyirran = new Terran("Тюирран");
        Terran tjarran = new Terran("Тярран");
        Terran terrun = new Terran("Террун");
        Terran terrin = new Terran("Террин");
        Terran terron = new Terran("Террон");
        Terran terrian = new Terran("Терриан");
        Terran terruin = new Terran("Терруин");
    }

}

class Zerg {
    private String name;

    public Zerg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Protos {
    private String name;

    public Protos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Terran {
    private String name;

    public Terran(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        BaseHero hero = new BaseHero();     // конструктор для героя
        ArrayList<BaseHero> heroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    heroes.add(new Sniper(getName()));
                    break;
                case 1:
                    heroes.add(new Crossbowman(getName()));
                    break;
                case 2:
                    heroes.add(new Wizard(getName()));
                    break;
                case 3:
                    heroes.add(new Monk(getName()));
                    break;
                case 4:
                    heroes.add(new Spearman(getName()));
                    break;
                case 5:
                    heroes.add(new Thief(getName()));
                    break;
                default:
                    heroes.add(new Peasant(getName()));
            }
        }

        heroes.forEach(n -> System.out.println(n.name + " " + n.getInfo()));

        // Созаем объект spell и вызываем его рандомным числом из enum SpellBook:
        SpellBook spell = SpellBook.values()[new Random().nextInt(Names.values().length)];

    }
    // создаем метод для получения имен из enum (находится в том-же пакете вместе с Main)
    // поэтому отдельно его вызывать нет необходимости:
    private static String getName() {
       return Names.values()[new Random().nextInt(Names.values().length)].toString();   // рандомно присваиваем имена объектам из массива имен в enum
    }
}

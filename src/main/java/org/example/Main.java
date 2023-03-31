package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        BaseHero hero = new BaseHero();     // конструктор для героя
        int teamMemberNum = 10;
        System.out.println("\nКоманда 1:");
        ArrayList<BaseHero> team1 = team1(teamMemberNum);
        team1.forEach(n -> System.out.println(n.name + " " + n.getInfo()));

        System.out.println("\nКоманда 2:");
        ArrayList<BaseHero> team2 = team2(teamMemberNum);
        team2.forEach(n -> System.out.println(n.name + " " + n.getInfo()));

        // Созаем объект spell и вызываем его рандомным числом из enum SpellBook:
//        SpellBook spell = SpellBook.values()[new Random().nextInt(Names.values().length)];

    }
    // создаем метод для получения имен из enum (находится в том-же пакете вместе с Main)
    // поэтому отдельно его вызывать нет необходимости:
    private static String getName() {
       return Names.values()[new Random().nextInt(Names.values().length)].toString();   // рандомно присваиваем имена объектам из массива имен в enum
    }
    // метод для рандомного подбора команды
    private static ArrayList<BaseHero> team1(int num) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    heroes.add(new Crossbowman(getName()));
                    break;
                case 1:
                    heroes.add(new Monk(getName()));
                    break;
                case 2:
                    heroes.add(new Spearman(getName()));
                    break;
                default:
                    heroes.add(new Peasant(getName()));
            }
        }
        return heroes;
    }
    private static ArrayList<BaseHero> team2(int num) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    heroes.add(new Sniper(getName()));
                    break;
                case 1:
                    heroes.add(new Wizard(getName()));
                    break;
                case 3:
                    heroes.add(new Thief(getName()));
                    break;
                default:
                    heroes.add(new Peasant(getName()));
            }
        }
        return heroes;
    }
}

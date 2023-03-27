import units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BaseHero hero = new BaseHero();     // конструктор для героя
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Sniper("Ольга"));
        heroes.add(new Crossbowman("Алексей"));
        heroes.add(new Mage("Олег"));
        heroes.add(new Monk("Дмитрий"));
        heroes.add(new Spearman("Ярослав"));
        heroes.add(new Thief("Роман"));
        heroes.add(new Peasant("Валентин"));


        heroes.forEach(n -> System.out.println(n));

    }
}

/**
 * Абстрактный класс 2-ого уровня (для создания стрелков)
 */
package org.example.units;
import java.util.Random;
import java.util.ArrayList;

public abstract class Shooter extends BaseHero {
    int arrows, maxArrows;         // кол-во стрел

    int accuracy;       // точность выстрела

    public Shooter(float hp, String name, boolean team, int armor, int[] damage, int arrows, int accuracy, String class_name) {
        super(hp, name, team, armor, damage, class_name);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }

    // Вызов и реализация методов из родительского класса для данного класса Shooter:

    // метод действия/хода персонажа данного класса:
    // условие для реализации - жив и есть стрелы
    // действие - найти ближайшего и вызвать след. метод shoot
    public void step(ArrayList<BaseHero> enemyTeam) {
        System.out.println("Ходит - " + getInfo());
        if (hp <= 0 || arrows <= 0) return;
        BaseHero closestEnemy = findClosedEnemy(enemyTeam);
        System.out.println("Найден ближайший противник -> " + closestEnemy.getInfo());
        shoot(closestEnemy);
    }

    // метод выстрела/нанесение урона:
    // урон выпадает рандомом в дельте min -max дамга героя данного класса(или дочернего)
    public void shoot(BaseHero enemy){
        System.out.println("---Shoot!-->");
        int dmg = new Random().nextInt(damage[0],damage[1]);
        enemy.getDamage(dmg);
        System.out.println(enemy.getInfo() + " получил(а) урон: " + dmg + "\n");
    }
}

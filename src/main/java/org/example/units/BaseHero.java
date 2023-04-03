/**
 * Шаблон(класс) для создания базового героя
 * абстрактный класс - нельзя создать экземпляр , но на базе этого шаблона создаются герои
 * поля protected видны/можно вызвать только внутри пакета (*units)
 */
package org.example.units;
import org.example.Names;
import org.example.units.GameInterface;
import org.example.weapon.Weapons;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface {
// implements GI обозначаем реализацию интерфеса в этом родительском классе

    protected String name;
    protected String class_name;
    protected boolean team;
    protected static int count;
    protected static int team1_x = 0;
    protected static int team1_y = 0;

    protected static int team2_x = 9;
    protected static int team2_y = 0;

    protected MoveCoords pos;
    protected float hp, maxHp;
    protected int armor;
    protected int [] damage;
    protected Weapons weapon;

    public String getHeroName() {
        return name;
    }

    @Override
    public  String toString() {
        return  getInfo()  + "\n" + "Здоровье: " + this.hp + "Броня: " + this.armor;
    }
    public String getPosition() {
        return pos.toString();
    }
    public BaseHero(float hp, String name, boolean team, int armor, int[] damage, String class_name) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;    //?
        if (team) {
            this.pos = new MoveCoords(team1_x, team1_y++);
        }
        else {
            this.pos = new MoveCoords(team2_x, team2_y++);
        }
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
        count++;
    }

    protected  int getInt() {return 1;}

    // метод из игрового интерфеса для получения имени конкретного героя:
    @Override
    public String getInfo() {
        return getClass().getSimpleName();
    }
    public static int getCount() {
        return count;
    }
    // метод присваивания имени при формировании команд из списка имен enum:
    public String getName () {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    // метод поиска ближайшего противника :
    public BaseHero findClosedEnemy(ArrayList<BaseHero> enemyTeam) {
        BaseHero closedEnemy = enemyTeam.get(0);
        double dist = MoveCoords.getDist(this.pos, enemyTeam.get(0).pos);
        double minDist = dist;
        for (int i = 1; i < enemyTeam.size(); i++) {
            if (enemyTeam.get(i).hp <= 0) continue;
            dist = MoveCoords.getDist(this.pos, enemyTeam.get(i).pos);
            if (minDist > dist) {
                minDist = dist;
                closedEnemy = enemyTeam.get(i);
            }
        }
        return closedEnemy;
    }
    // метод подсчета урона при атаке:
    public void getDamage (int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    @Override                // переопределение метода
    public void step(ArrayList<BaseHero>enemyTeam){}    // заглушки для интерфеса, пока мы им не пользуемся(не реализуем)
    /**
     @Override
     public String getInfo(){return null;}   // этот метод мы использовали на конкретных объектах, заглушка уже не нужна
     */

}

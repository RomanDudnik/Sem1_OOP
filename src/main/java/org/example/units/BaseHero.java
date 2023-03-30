/**
 * Шаблон(класс) для создания базового героя
 * абстрактный класс - нельзя создать экземпляр , но на базе этого шаблона создаются герои
 * поля protected видны/можно вызвать только внутри пакета (*units)
 */
package org.example.units;
import org.example.Names;
import org.example.units.GameInterface;
import org.example.weapon.Weapons;

import java.util.Random;

public abstract class BaseHero implements GameInterface {
// implements GI обозначаем реализацию интерфеса в этом родительском классе

    public String name;
    public String class_name;

    protected int x, y;
    protected float hp, maxHp;
    protected int armor;
    protected int [] damage;
    protected Weapons weapon;

    @Override
    public  String toString() {
        return name + " " + hp + " " + armor + " " + class_name;
    }
    public BaseHero(float hp, int x, int y, int armor, int[] damage, String class_name) {
        this.name = getName();
        this.hp = hp;
        this.maxHp = hp;    //?
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }

    @Override                // переопределение метода
    public void step(){}    // заглушки для интерфеса, пока мы им не пользуемся(не реализуем)
    /**
    @Override
    public String getInfo(){return null;}   // этот метод мы использовали на конкретных объектах, заглушка уже не нужна
    */

    protected  int getInt() {return 1;}
    public String getName () {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}

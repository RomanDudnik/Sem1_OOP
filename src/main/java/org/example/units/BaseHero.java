package org.example.units;

import org.example.Names;
import org.example.units.GameInterface;
import org.example.weapon.Weapons;

import java.util.Random;

public abstract class BaseHero implements GameInterface {

//    private int id;
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
    public BaseHero(float hp, String name, int x, int y, int armor, int[] damage, String class_name) {
        this.name = getName();
        this.hp = hp;
        this.maxHp = hp;    //?
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }

    @Override
    public void step(){}
    @Override
    public String getInfo(){return null;}

    protected  int getInt() {return 1;}
    public String getName () {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }



//    public BaseHero() {
//        id = new Random().nextInt();
//    }
//    public String toSring() {
//        return String.valueOf(id);
//    }


}

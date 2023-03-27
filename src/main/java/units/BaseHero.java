package units;

import weapon.Weapons;

public abstract class BaseHero {

//    private int id;
    public String name;
    protected String class_name;

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
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;    //?
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }

    protected  int getInt() {
        return 1;
    }



//    public BaseHero() {
//        id = new Random().nextInt();
//    }
//    public String toSring() {
//        return String.valueOf(id);
//    }


}

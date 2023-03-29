package org.example.units;

public abstract class Shooter extends BaseHero {
    int arrows;

    int accuracy;

    public Shooter(float hp, String name, int x, int y, int armor, int[] damage, int arrows, int accuracy, String class_name) {
        super(hp, name, x, y, armor, damage, class_name);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }

    protected void shoot(){
        System.out.println("Shoot!");
    }
}

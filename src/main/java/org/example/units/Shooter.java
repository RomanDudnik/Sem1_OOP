/**
 * Абстрактный класс 2-ого уровня (для создания стрелков)
 */
package org.example.units;

public abstract class Shooter extends BaseHero {
    int arrows, maxArrows;         // кол-во стрел

    int accuracy;       // точность выстрела

    public Shooter(float hp, int x, int y, int armor, int[] damage, int arrows, int accuracy, String class_name) {
        super(hp, x, y, armor, damage, class_name);
        this.arrows = arrows;
        maxArrows = arrows;
        this.accuracy = accuracy;
    }

    public void shoot(){
        System.out.println("Shoot!");
    }
}

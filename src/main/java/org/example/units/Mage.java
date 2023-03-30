/**
 * Маг
 */
package org.example.units;

public abstract class Mage extends BaseHero {

    protected int mana;

    public Mage(float hp, int x, int y, int armor, int[] damage, int mana, String class_name) {
        super(hp, x, y, armor, damage, class_name);
        this.mana = mana;
    }
    public void health(){
        System.out.println("Health!");
    }
}

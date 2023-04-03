/**
 * Маг
 */
package org.example.units;

public abstract class Mage extends BaseHero {

    protected int mana;

    public Mage(float hp, String name, boolean team, int armor, int[] damage, int mana, String class_name) {
        super(hp, name, team, armor, damage, class_name);
        this.mana = mana;
    }
    public void health(){
        System.out.println("Health!");
    }
}

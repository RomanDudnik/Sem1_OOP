/**
 * Маг
 */
package org.example.units;

public abstract class Mage extends BaseHero {

    protected int mana;

    public Mage(float hp, String name, int x, int y, int armor, int[] damage, int mana, String class_name) {
        super(hp, name, x, y, armor, damage, class_name);
        this.mana = mana;
    }

    // реализуем метод интерфеса:


}

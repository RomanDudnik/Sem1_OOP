/**
 * Маг (волшебник - лечит)
 */
package org.example.units;

import java.util.ArrayList;

public class Wizard extends Mage {
    protected int mana;
    //    protected ArrayList<Spells> spells_book;
    public Wizard (String name, boolean team1) {
        super(100, name, team1, 50,  new int[]{6, 12}, 100,"Маг");
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}

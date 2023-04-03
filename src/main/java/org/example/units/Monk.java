/**
 * Монах
 */
package org.example.units;

import java.util.ArrayList;

public class Monk extends Mage {
    protected int mana;
//    protected ArrayList<Spells> spells_book;    // книга заклинаний
    public Monk (String name, boolean team1) {
        super(150, name, team1, 30, new int[]{5, 8}, 80,"Монах");
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }

}

/**
 * Монах
 */
package org.example.units;

public class Monk extends Mage {
    protected int mana;
//    protected ArrayList<Spells> spells_book;    // книга заклинаний
    public Monk (String name) {
        super(150, name, 1, 6, 30, new int[]{5, 8}, 80,"Монах");
    }
    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return ": Я - монах";
    }

}

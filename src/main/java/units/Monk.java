/**
 * Монах
 */
package units;

import java.util.ArrayList;

public class Monk extends BaseHero {
    protected int mana;
    protected ArrayList<Spells> spells_book;    // книга заклинаний
    public Monk (String name) {
        super(150, name, 1, 6, 30, new int[]{5, 8}, "Монах");
        mana = 80;
    }

}

/**
 * Маг
 */
package units;
import java.util.ArrayList;

public class Mage extends BaseHero {
    protected int mana;
    protected ArrayList<Spells> spells_book;
    public Mage(String name) {
        super(100, name, 1, 6, 50,  new int[]{6, 12}, "Маг");
        mana = 100;

    }

}

/**
 * Копейщик (ближний бой)
 */
package units;

public class Spearman extends BaseHero {
    protected  int death_blow;
    public Spearman(String name) {
        super(200, name, 1, 6, 100, new int[]{10, 20}, "Копейщик");
        death_blow = 1;
    }
}

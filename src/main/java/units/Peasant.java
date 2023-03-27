/**
 * Крестьянин (помощь)
 */
package units;

public class Peasant extends BaseHero {
    int maxLoad;
    public Peasant(String name) {
        super(200, name, 1, 6, 20, new int[]{3, 5}, "Крестьянин");
        maxLoad = 50;
    }
}

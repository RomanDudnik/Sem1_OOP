/**
 * Снайпер (дльние позиции)
 */
package units;

import javax.xml.namespace.QName;

public class Sniper extends BaseHero {

    int arrows;

    int accuracy;

    public Sniper (String name) {
        super(100, name, 1, 6, 50, new int[]{6, 12}, "Снайпер");
        arrows = 10;
        accuracy = 70;
    }
}



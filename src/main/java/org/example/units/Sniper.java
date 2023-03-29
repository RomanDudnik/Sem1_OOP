/**
 * Снайпер (дльние позиции)
 */
package org.example.units;

public class Sniper extends Shooter {

        public Sniper (String name) {
        super(100, name, 1, 6, 50, new int[]{6, 12}, 12,50,"Снайпер");
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return ":Я - снайпер";
    }
}



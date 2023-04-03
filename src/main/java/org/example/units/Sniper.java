/**
 * Снайпер (дльние позиции)
 */
package org.example.units;

import java.util.ArrayList;

public class Sniper extends Shooter {

        public Sniper (String name, boolean team1) {

            super(100,name, team1,50, new int[]{6, 12}, 12,50,"Снайпер");
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}



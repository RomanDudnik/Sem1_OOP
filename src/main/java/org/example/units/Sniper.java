/**
 * Снайпер (дльние позиции)
 */
package org.example.units;

public class Sniper extends Shooter {

        public Sniper (String name) {
        super(100, name, 1, 6, 50, new int[]{6, 12}, 10,70,"Снайпер");
    }
    @Override
    public String getInfo() {
        return "Я снайпер";
    }
}



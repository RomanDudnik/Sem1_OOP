/**
 * Арбалетчик (средняя дистанция)
 */
package org.example.units;

public class Crossbowman extends Shooter {
    public Crossbowman (String name) {
        super(100, name,1, 6, 75, new int[]{8, 14}, 10, 50, "Арбалетчик");
    }
    @Override
    public String getInfo() {
        return "Я арбалетчик";
    }
}

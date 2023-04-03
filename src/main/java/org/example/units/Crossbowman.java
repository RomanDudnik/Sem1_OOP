/**
 * Арбалетчик (средняя дистанция)
 */
package org.example.units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman (String name, boolean team1) {
        super(100,name, team1,75, new int[]{8, 14}, 10, 75, "Арбалетчик");
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}

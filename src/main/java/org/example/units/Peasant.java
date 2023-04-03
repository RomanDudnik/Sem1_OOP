/**
 * Крестьянин (помощь)
 */
package org.example.units;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    int maxLoad;
    public Peasant(String name, boolean team1) {
        super(200, name, team1, 20, new int[]{3, 5}, "Крестьянин");
        maxLoad = 50;
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}

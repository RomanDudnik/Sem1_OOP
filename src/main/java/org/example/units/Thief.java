/**
 * Вор (тихий воин)
 */
package org.example.units;

import java.util.ArrayList;

public class Thief extends BaseHero {
    int stealthMode;
    public Thief(String name, boolean team1) {
        super(100, name, team1, 50, new int[]{8, 15}, "Вор");
        stealthMode = 10;
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}

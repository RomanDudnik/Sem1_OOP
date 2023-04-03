/**
 * Копейщик (ближний бой)
 */
package org.example.units;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    protected  int death_blow;
    public Spearman(String name, boolean team1) {
        super(200, name, team1,100, new int[]{10, 20}, "Копейщик");
        death_blow = 1;
    }

    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return class_name + " " + name;
    }
}

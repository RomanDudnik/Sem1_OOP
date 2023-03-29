/**
 * Крестьянин (помощь)
 */
package org.example.units;

public class Peasant extends BaseHero {
    int maxLoad;
    public Peasant(String name) {
        super(200, name, 1, 6, 20, new int[]{3, 5}, "Крестьянин");
        maxLoad = 50;
    }
    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return ": Я - крестьянин";
    }
}

/**
 * Вор (тихий воин)
 */
package org.example.units;

public class Thief extends BaseHero {
    int stealthMode;
    public Thief(String name) {
        super(100, 1, 6, 50, new int[]{8, 15}, "Вор");
        stealthMode = 10;
    }
    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return ": Я - вор";
    }
}

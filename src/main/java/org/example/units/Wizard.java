package org.example.units;

public class Wizard extends Mage {
    protected int mana;
    //    protected ArrayList<Spells> spells_book;
    public Wizard (String name) {
        super(100, 1, 6, 50,  new int[]{6, 12}, 100,"Маг");

    }
    // реализуем метод интерфеса:
    @Override
    public String getInfo() {
        return ": Я - маг";
    }
}

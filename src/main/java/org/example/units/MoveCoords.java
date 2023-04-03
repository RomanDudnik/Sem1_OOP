/**
 * Класс для получения методов передвижения персонажей в пространстве координат
 * Конструктор для перемещений и поиска персонажей
 */
package org.example.units;

public class MoveCoords {
    protected int x, y;
    // метод получения координат:
    public MoveCoords (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // метод отображения координат:
    @Override
    public String toString() {
        return "(x,y): " + "(" + this.x + ", " + this.y + ")";
    }

    // метод расчета координат по мат.формуле:
    public static double getDist (MoveCoords moveCoords_1, MoveCoords moveCoords_2) {
        return Math.sqrt(Math.pow(moveCoords_1.x - moveCoords_2.x, 2) + Math.pow(moveCoords_1.y - moveCoords_2.y, 2));
    }
}

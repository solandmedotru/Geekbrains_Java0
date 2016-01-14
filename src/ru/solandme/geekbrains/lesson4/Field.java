package ru.solandme.geekbrains.lesson4;

public class Field {

    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    void doShoot(int shoot) {
        if (cells[shoot] == '.') {
            System.out.println("Промах");
            cells[shoot] = 'v';
        } else if (cells[shoot] == 'X') {
            System.out.println("ПОПАЛ!!!");
            cells[shoot] = '*';
        } else {
            System.out.println("Уже стреляли туда");
        }
    }

    void show() {
        System.out.println(cells);
    }

    boolean isNotGameOver() {
        for (char cell : cells) {
            if (cell == 'X') {
                return true;
            }
        }
        return false;
    }
}

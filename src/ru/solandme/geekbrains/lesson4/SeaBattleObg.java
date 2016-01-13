package ru.solandme.geekbrains.lesson4;

import java.util.Random;

public class SeaBattleObg {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        field.init();
        Random random = new Random();
        Ship ship1 = new Ship(random.nextInt(10));
        Ship ship2 = new Ship(random.nextInt(10));

        if (ship1.position == ship2.position) {
            while (ship1.position == ship2.position) {
                ship2.position = random.nextInt(10);
            }
        }

        field.setShip(ship1);
        field.setShip(ship2);

        System.out.println("ИГРА НАЧИНАЕТСЯ!!!");

        while (field.isNotGameOver()) {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        }
        System.out.println("GAME OVER");
    }

}

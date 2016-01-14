package ru.solandme.geekbrains.lesson4;

import java.util.Random;

public class SeaBattleObg {
    static Field field = new Field();
    static Player player = new Player();
    static Random random = new Random();
    static Ship ship1 = new Ship(random.nextInt(10));
    static Ship ship2 = new Ship(random.nextInt(10));

    public static void main(String[] args) {

        field.init();

        initShipPosition(field, random, ship1, ship2);

        mainGameLoop(field, player);
    }

    private static void initShipPosition(Field field, Random random, Ship ship1, Ship ship2) {
        if (ship1.position == ship2.position) {
            while (ship1.position == ship2.position) {
                ship2.position = random.nextInt(10);
            }
        }

        field.setShip(ship1);
        field.setShip(ship2);
    }

    private static void mainGameLoop(Field field, Player player) {
        System.out.println("ИГРА НАЧИНАЕТСЯ!!!");

        while (field.isNotGameOver()) {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        }
        System.out.println("GAME OVER");
    }

}

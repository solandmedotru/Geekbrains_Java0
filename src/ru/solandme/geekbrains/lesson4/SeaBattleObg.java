package ru.solandme.geekbrains.lesson4;

public class SeaBattleObg {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        field.init();
        Ship ship = new Ship(4);

        field.setShip(ship);

        System.out.println("Game Start");

        while (field.isNotGameOver()){
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        }
    }

}

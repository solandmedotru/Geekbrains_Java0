package ru.solandme.geekbrains.lesson4;

public class SeaBattleObg {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        field.init();
        Ship ship = new Ship(4);
        Ship ship2 = new Ship(5);

        field.setShip(ship);
        field.setShip(ship2);

        System.out.println("ИГРА НАЧИНАЕТСЯ!!!");

        while (field.isNotGameOver()){
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);
        }
        System.out.println("GAME OVER");
    }

}

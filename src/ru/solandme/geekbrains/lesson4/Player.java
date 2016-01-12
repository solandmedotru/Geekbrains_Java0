package ru.solandme.geekbrains.lesson4;

import java.util.Scanner;

public class Player {

    int getShoot(){
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели %s\n", s);
        int shot;
        shot = Integer.parseInt(s);
        return shot;
    }
}

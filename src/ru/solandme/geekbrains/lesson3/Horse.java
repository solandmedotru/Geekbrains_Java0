package ru.solandme.geekbrains.lesson3;
import java.util.Random;

public class Horse {
    String name;
    int speed;
    String color;
    Boolean isMale;
    int age;
    Random random = new Random();

    void eat(){
        System.out.println("Лошадь " + this.name + " сейчас кушает");
    }

    void about(){
        String sex = (isMale) ? "Male" : "Female";
        System.out.printf("name: %s, age: %d, sex: %s ", name, age, sex);
    }

    void ride(){
        about();
        System.out.println("скачет со скоростью: " + speed);
    }
}

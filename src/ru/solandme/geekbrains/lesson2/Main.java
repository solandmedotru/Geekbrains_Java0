package ru.solandme.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.name = "Murka";
        cat1.about();

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.name = "Tom";
        cat2.isMale = true;
        cat2.about();
    }
}

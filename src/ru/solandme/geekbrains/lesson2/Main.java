package ru.solandme.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(3, "Murka", false);
        Cat cat2 = new Cat(2, "Tom", true);

        cat1.about();
        cat2.about();

    }
}

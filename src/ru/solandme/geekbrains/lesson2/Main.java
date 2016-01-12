package ru.solandme.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(3, "Мурка", false);
        Cat cat2 = new Cat(2, "Том", true);
        Cat cat3 = new Cat();

        cat1.about();
        cat1.sleep();

        cat2.about();
        cat2.voice();

        cat3.about();
    }
}

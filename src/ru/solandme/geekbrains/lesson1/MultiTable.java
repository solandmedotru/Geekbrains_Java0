package ru.solandme.geekbrains.lesson1;

public class MultiTable {
    public static void main(String[] args) {
        outResult(1);
        outResult(4);
        outResult(7);
    }

    private static void outResult(int start) {
        System.out.println("-------------------------------------------------");
        for (int i = 1; i < 10; i++) {
            for (int j = start; j < start + 3; j++) {
                System.out.printf("|\t%d * %d = %d\t", j, i, i * j);
            }
            System.out.println("|");
        }
    }
}


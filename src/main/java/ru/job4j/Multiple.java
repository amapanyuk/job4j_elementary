package ru.job4j;

public class Multiple {
    public static void main(String[] args) {

        // Решение как в задании

        /*
        System.out.println("1 * 0 = 0");
        System.out.println("1 * 1 = 1");
        System.out.println("1 * 2 = 2");
        System.out.println("1 * 3 = 3");
        System.out.println("1 * 4 = 4");
        System.out.println("1 * 5 = 5");
        System.out.println("1 * 6 = 6");
        System.out.println("1 * 7 = 7");
        System.out.println("1 * 8 = 8");
        System.out.println("1 * 9 = 9");
        */

        // Решение с циклом
        for (int i = 0; i < 10; i++) {
            System.out.println("1" + " * " + i + " = " + i);
        }
    }
}

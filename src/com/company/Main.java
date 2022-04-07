package com.company;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        // Задача 2

        for (int friday = 2; friday <= 31; friday = friday + 7) {
            System.out.println("Today is Friday " + friday + ". It's time to make a report.");
        }

        // Задача 3

        int startOfObservation = 1822;
        for (int comet = 0; comet < 2122; comet = comet + 79) { // в условии прописал полседний интересующий нас год наблюдений
            if (comet > startOfObservation) {
                    System.out.println(comet);
            }
        }
    }
}

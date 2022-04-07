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

        for (int friday = 1; friday <= 31; friday = friday + 7) {  // сделал несколько условий которые будут менять окончание после даты. Тем самым повторил тему условных операторов
            if (friday == 1 || friday == 21 || friday == 31) {
                System.out.println("Today is Friday " + friday + "st. It's time to make a report.");
            } else if (friday == 2 || friday == 22) {
                System.out.println("Today is Friday " + friday + "nd. It's time to make a report.");
            } else if (friday == 3 || friday == 23) {
                System.out.println("Today is Friday " + friday + "rd. It's time to make a report.");
            } else
                System.out.println("Today is Friday " + friday + "th. It's time to make a report.");
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

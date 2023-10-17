package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);
    private int[][] array;

    public int[][] createArray() {

        while (true) {
            System.out.println("Podaj liczbę wierszy.");
            int rowNum = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn.");
            int columnNum = scanner.nextInt();

            if (rowNum > 100 || columnNum > 100) {
                System.out.println("Maksymalny rozmiar tabeli to 100x100");

            } else {
                array = new int[rowNum][columnNum];

                for (int i = 0; i < rowNum; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = i * j;
                    }
                }
                break;
            }

        }
        return array;
    }

    public void printArray() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d |", array[i][j]);
            }
            System.out.printf("%n");
            int count = array.length * 6;
            char c = '_';
            for (int k = 0; k < count; k++) {
                System.out.printf("%c", c);
            }
            System.out.printf("%n");

        }
    }
}


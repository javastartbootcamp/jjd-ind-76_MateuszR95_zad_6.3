package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    public int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        int[][] array;

        while (true) {
            System.out.println("Podaj liczbę wierszy.");
            int rowNum = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn.");
            int columnNum = scanner.nextInt();

            if (rowNum > 100 || columnNum > 100) {
                System.out.println("Maksymalny rozmiar tabeli to 100x100");
                continue;
            }
            array = new int[rowNum][columnNum];

            for (int i = 0; i < rowNum; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i * j;
                }
            }
            break;
        }

        return array;
    }

    public void printArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d |", array[i][j]);
            }
            System.out.printf("%n");
            String line = "______";
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%s", line);
            }
            System.out.printf("%n");

        }
    }
}


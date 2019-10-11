package main.JAVA.arrayConcept;

import java.sql.SQLOutput;

public class App3 {
    public static void main(String[] args) {
        int[] values = {27, 01, 95};
        System.out.println(values[2]);
        int[][] grid = {
                {27, 01, 95},
                {1, 9},
                {28, 10, 98}
        };/*
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);
        for (int row=0; row < grid[row].length; row++) {
            for (int col=0; col < grid[row].length; col++)
                System.out.println(grid[row][col] + "\t");
        }*/
        String[][] words = new String[2][];
        System.out.println(words[0]);
        words[0] = new String[3];
        words [0][1] = "hi there";
        System.out.println(words[0][1]);
    }
}

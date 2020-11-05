package com.company;

import java.util.Scanner;

public class Main {
    static int [] Sorter (int n []) {
        for(int j = 1; j< n.length; j++) {
            for (int i = 0; i < n.length - j; i++) {
                if (n[i] > n[i + 1]) {
                    int f = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = f;
                }
            }
        }
        return n;
    }
    public static int getInt() {
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console1 = new Scanner(System.in);
            if (console1.hasNextInt()) {
                i = console1.nextInt();
                flag = false;
            } else {
                System.out.println("Error");
            }
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println("Write size of first matrix :");
        int sizeOfFirsMatrix = getInt();
        System.out.println("Write size of second matrix :");
        int sizeOfSecondMatrix = getInt();
        int firstMatrix [] = new int [sizeOfFirsMatrix+sizeOfSecondMatrix];
        int secondMatrix [] = new int [sizeOfSecondMatrix];
        for(int i = 0; i < sizeOfFirsMatrix; i++){
            firstMatrix [i] = (int)(Math.random()*20);
        }
        for(int i = 0; i < sizeOfSecondMatrix; i++){
            secondMatrix [i] = (int)(Math.random()*20);
        }
        firstMatrix = Sorter(firstMatrix);
        secondMatrix = Sorter(secondMatrix);
        for (int i = sizeOfSecondMatrix; i < firstMatrix.length; i++){
            System.out.print(firstMatrix[i] + ", ");
        }
        System.out.println("");
        for ( int i = 0; i < sizeOfSecondMatrix; i++){
            System.out.print(secondMatrix[i] + ", ");
        }
        System.out.println("");
        for(int i = 0; i < sizeOfSecondMatrix; i++){
            firstMatrix[i] = secondMatrix [i];
        }
        firstMatrix = Sorter(firstMatrix);
        for (int i = 0; i < firstMatrix.length; i++){
            System.out.print(firstMatrix[i] + ", ");
        }
    }
}

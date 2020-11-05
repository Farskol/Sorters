package com.company;

import java.util.Scanner;

public class Main {
    static double [] Sorter (double n []) {
        for(int j = 1; j< n.length; j++) {
            for (int i = 0; i < n.length - j; i++) {
                if (n[i] > n[i + 1]) {
                    double f = n[i];
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
        System.out.print("Write size of first matrix: ");
        int sizeOfFirstMatrix = getInt();
        System.out.print("Write size of first matrix: ");
        int sizeOfSecondMatrix = getInt();
        double firstMatrix [] = new double[sizeOfFirstMatrix];
        for(int i = 0; i < sizeOfFirstMatrix; i++){
            firstMatrix [i] = (Math.random()*10);
        }
        double secondMatrix [] = new double[sizeOfSecondMatrix];
        for(int i = 0; i < sizeOfSecondMatrix; i++){
            secondMatrix [i] = (Math.random()*10);
        }
        firstMatrix = Sorter(firstMatrix);
        secondMatrix = Sorter(secondMatrix);
        for (int i = 0; i < sizeOfFirstMatrix; i++){
            System.out.print(firstMatrix[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < sizeOfSecondMatrix; i++){
            System.out.print(secondMatrix[i] + ", ");
        }
        System.out.println("");
        double newMatrix [] = new double[sizeOfFirstMatrix+sizeOfSecondMatrix];
        for (int i = 0; i <sizeOfFirstMatrix;i++ ){
            newMatrix[i] = firstMatrix [i];
        }
        for (int i = sizeOfFirstMatrix; i <newMatrix.length; i++ ){
            newMatrix[i] = secondMatrix [i-sizeOfFirstMatrix];
        }
        int numberOfMatrix [] = new int [sizeOfSecondMatrix];
        newMatrix = Sorter(newMatrix);
        for (int i = 0;i < sizeOfSecondMatrix; i++){
            for (int j = 0; j < newMatrix.length; j++){
                if (secondMatrix [i] == newMatrix[j]){
                    numberOfMatrix[i] = j+1;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < newMatrix.length; i++){
            System.out.print(newMatrix[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i < sizeOfSecondMatrix; i++){
            System.out.print(numberOfMatrix[i] + ", ");
        }
        System.out.println("");
    }
}

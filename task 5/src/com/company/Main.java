package com.company;

import java.util.Scanner;

public class Main {
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
    public static int [] Task_5(int newMatrix[], int number){
        for (int i = 0; i < number; i++) {
            if (newMatrix[number-i] < newMatrix[number - 1-i]) {
                int n = newMatrix[number-i];
                newMatrix[number-i] = newMatrix[number - 1-i];
                newMatrix[number - 1-i] = n;
            }
        }
        return newMatrix;
    }
    public static void main(String[] args) {
        System.out.print("Write size of matrix: ");
        int sizeOfMatrix = getInt();
        int matrix [] = new int [sizeOfMatrix];
        for(int i = 0; i < sizeOfMatrix; i++){
            matrix [i] = (int)(Math.random()*20);
        }
        for (int i = 0; i < sizeOfMatrix; i++){
            System.out.print(matrix[i] + ", ");
        }
        System.out.println("");
        for (int i = 1; i < sizeOfMatrix; i++){
            matrix=Task_5(matrix,i);
        }
        for (int i = 0; i < sizeOfMatrix; i++){
            System.out.print(matrix[i] + ", ");
        }
        System.out.println("");
    }
}

package com.company;

import java.util.Scanner;

public class Main {
    // метод который я использую для того чтобы привести массив к виду а1 < a2 < a3... и т.д.
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
    // метод который я использую что бы вводить только целые числа
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
    public static int [] Task_3(int newMatrix []){
        for (int i = 0; i < newMatrix.length-1; i++){
            int number = 0;
            int index = 0;
            for (int j = i; j < newMatrix.length; j++){
                if(number < newMatrix[j]){
                    number = newMatrix[j];
                    index = j;
                }
            }
            newMatrix[index] = newMatrix[i];
            newMatrix[i] = number;
        }
        return newMatrix;
    }
    static int [] Task_4 (int newMatrix []) {
        for(int j = 1; j< newMatrix.length; j++) {
            for (int i = 0; i < newMatrix.length - j; i++) {
                if (newMatrix[i] < newMatrix[i + 1]) {
                    int f = newMatrix[i];
                    newMatrix[i] = newMatrix[i + 1];
                    newMatrix[i + 1] = f;
                }
            }
        }
        return newMatrix;
    }
    static int [] Task_6 (int newMatrix []){
        for (int i = 0; i < newMatrix.length-1; i++){
            if (newMatrix[i] > newMatrix [i+1]){
                int f = newMatrix[i];
                newMatrix[i] = newMatrix[i + 1];
                newMatrix[i + 1] = f;
                if(i > 0){
                    i-=2;
                }
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
        matrix = Task_6(matrix);
        for (int i = 0; i < sizeOfMatrix; i++){
            System.out.print(matrix[i] + ", ");
        }
        System.out.println("");
        matrix = Task_4(matrix);
        for (int i = 0; i < sizeOfMatrix; i++){
            System.out.print(matrix[i] + ", ");
        }
        System.out.println("");
    }
}

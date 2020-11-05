package com.company;

import java.nio.file.FileStore;
import java.util.Scanner;

public class Main {
    static int[] Sorter(int[] n) {
        for(int j = 1; j < n.length; ++j) {
            for(int i = 0; i < n.length - j; ++i) {
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

        while(flag) {
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
        System.out.print("Write size of numbers: ");
        int sizeOfFirstMatrix = getInt();
        int[] firstMatrix = new int[sizeOfFirstMatrix];
        for(int i = 0; i < sizeOfFirstMatrix; ++i) {
            firstMatrix[i] = (int)(Math.random() * 10.0+2);
        }
        int[] secondMatrix = new int[sizeOfFirstMatrix];
        for(int i = 0; i < sizeOfFirstMatrix; ++i) {
            secondMatrix[i] = firstMatrix[i]+(int)(Math.random() * 10.0+1);
        }
        for(int i = 0; i < sizeOfFirstMatrix; ++i) {
            System.out.print(firstMatrix[i] + "/" + secondMatrix[i]+", ");
        }
        System.out.println("");
        // Здесь я осознал что вывод чисел можно было сделать ввиде метода
        int generalDenominator = secondMatrix[0];
        for (int i = 1; i < sizeOfFirstMatrix; i++){
             generalDenominator *= secondMatrix[i];
        }
        for (int i = 0; i < sizeOfFirstMatrix; i++){
            for (int  j = 0; j < sizeOfFirstMatrix; j++){
                if (j != i){
                    firstMatrix[i]*= secondMatrix[j];
                }
            }
        }
        firstMatrix = Sorter(firstMatrix);
        System.out.println("");
        for (int h = 0; h < sizeOfFirstMatrix; h++) {
            for (int i = 2; i < 11; i++) {
                int k = 0;
                for (int j = 0; j < sizeOfFirstMatrix; j++) {
                    if (firstMatrix[j] % i == 0 && generalDenominator % i == 0) {
                        k++;
                    }
                }
                if (k == sizeOfFirstMatrix) {
                    for (int j = 0; j < sizeOfFirstMatrix; j++) {
                        firstMatrix[j] /= i;
                    }
                    generalDenominator /= i;
                }
            }
        }
        System.out.println("general denominator :" + generalDenominator);
        for(int i = 0; i < sizeOfFirstMatrix; ++i) {
            System.out.print(firstMatrix[i] + "/" + generalDenominator + ", ");
        }

        System.out.println("");
    }
}

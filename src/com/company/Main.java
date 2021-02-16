package com.company;

public class Main {

    public static void main(String[] args) {

        long[] array = new long[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        ThanosSort.sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

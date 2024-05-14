package com.example.project6sort;

import java.util.Random;

public class Quick {
    public static void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {

            while (less(a[++i], v))
                if (i == hi) break;

            while (less(v, a[--j]))
                if (j == lo) break;

            if (i >= j) break;
            exch(a, i, j);
        }

        exch(a, lo, j);

        return j;
    }

    private static void shuffle(Comparable[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = i + rand.nextInt(a.length - i);
            exch(a, i, r);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static void printArray(Comparable[] a) {
        for (Comparable element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15 };
        System.out.println("Before sorting:");
        printArray(arr1);
        sort(arr1);
        System.out.println("After sorting:");
        printArray(arr1);

        String[] arr2 = {"banana", "apple", "orange", "grape", "pineapple", "mango", "watermelon", "strawberry", "cherry", "lemon" };
        System.out.println("\nBefore sorting:");
        printArray(arr2);
        sort(arr2);
        System.out.println("After sorting:");
        printArray(arr2);
    }

}
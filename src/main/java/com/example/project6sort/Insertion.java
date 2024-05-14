package com.example.project6sort;

public class Insertion {
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
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
        System.out.println("Before sorting:");
        printArray(arr2);
        sort(arr2);
        System.out.println("After sorting:");
        printArray(arr2);
    }

}


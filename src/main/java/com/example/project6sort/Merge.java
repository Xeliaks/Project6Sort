package com.example.project6sort;

public class Merge {
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // Copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        // Merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++]; // left half exhausted
            else if (j > hi) a[k] = aux[i++]; // right half exhausted
            else if (less(aux[j], aux[i])) a[k] = aux[j++]; // current key on right less than current key on left
            else a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
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

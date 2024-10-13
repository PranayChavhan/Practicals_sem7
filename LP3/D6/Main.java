package LP3.D6;

import java.util.*;

public class Main {
    public static int deterministicPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static int randomizedPartition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
        return deterministicPartition(arr, low, high);
    }

    public static void quickSort(int[] arr, int low, int high, boolean isRandomized) {
        if (low < high) {
            int pivotIndex;
            if (isRandomized) {
                pivotIndex = randomizedPartition(arr, low, high);
            } else {
                pivotIndex = deterministicPartition(arr, low, high);
            }
            quickSort(arr, low, pivotIndex - 1, isRandomized);
            quickSort(arr, pivotIndex + 1, high, isRandomized);
        }
    }

    public static void main(String[] args) {
        int[] arrSizes = {100, 1000, 10000, 100000};

        for (int size : arrSizes) {
            int[] arr = new Random().ints(size, 1, 1000).toArray();
            long start = System.nanoTime();
            quickSort(arr.clone(), 0, arr.length - 1, false);
            long end = System.nanoTime();
            double deterministicTime = (end - start) / 1e9;
            start = System.nanoTime();
            quickSort(arr.clone(), 0, arr.length - 1, true);
            end = System.nanoTime();
            double randomizedTime = (end - start) / 1e9;

            System.out.println("Array size: " + size);
            System.out.printf("Deterministic QuickSort time: %.6f seconds\n", deterministicTime);
            System.out.printf("Randomized QuickSort time: %.6f seconds\n", randomizedTime);
            System.out.println("-----------------------------------");
        }
    }
}

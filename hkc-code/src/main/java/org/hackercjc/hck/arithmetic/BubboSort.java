package org.hackercjc.hck.arithmetic;

public class BubboSort {
    public static void main(String[] args) {
        int[] arr = {2, 100,3, 1, 5, 4};
        bubboSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubboSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void swap(int[] arr, int from, int to) {
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }
}

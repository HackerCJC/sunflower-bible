package org.hackercjc.hck.arithmetic;

import java.util.Collections;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {2, 100,3, 1, 5, 4};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, j, i);
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

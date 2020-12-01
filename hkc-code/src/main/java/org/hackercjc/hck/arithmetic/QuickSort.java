package org.hackercjc.hck.arithmetic;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {2, 100, 3, 1, 5, 4};


        // Sort
        //        queckSort(arr, 0, arr.length - 1);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("1、QuickSort");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("----------");


        int[] arr2 = {2, 100, 3, 1, 5, 4};
        System.out.println("2、SelectSort");
        selectSort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }


        System.out.println("----------");
        int[] arr3 = {2, 100, 3, 1, 5, 4};
        System.out.println("3、BubboSort");
        bubboSort(arr3);
        for (int i : arr3) {
            System.out.println(i);
        }


        // Search
        System.out.println("----------");
        System.out.println("4、BinarySearch: ");
        System.out.println("Index: " + binarySearch(arr, 2));


    }


    public static void swap(int[] arr, int from, int to) {
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }


    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }


    public static void bubboSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static int binarySearch(int[] arr, int num) {
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low, j = high, tmp = arr[low];
        while (i < j) {
            while (tmp <= arr[j] && i < j) j--;
            while (tmp >= arr[i] && i < j) i++;
            swap(arr, i, j);
        }
        swap(arr, i, low);
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }


    // todo 插入排序

}

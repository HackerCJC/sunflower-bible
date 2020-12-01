package org.hackercjc.hck.arithmetic;


/**
 * 二分查找
 * <p>
 * 时间复杂度O(log(n))
 * </p>
 *
 * @author cuijianchen
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(arr, 6));
    }


       public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == num) {
                return middle;
            }
            if (arr[middle] > num) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}

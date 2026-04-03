package org.codePractices;

import java.util.Arrays;


import java.util.Arrays;
    public class LeftAndRightRotationOfArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int k = 2;

            rotateLeft(arr, k);

            System.out.println(Arrays.toString(arr));
        }

        public static void rotateLeft(int[] arr, int k) {
            int n = arr.length;
            k = k % n;

            int[] temp = new int[n];
            int j = 0;

            // Copy from k to end
            for (int i = k; i < n; i++) {
                temp[j] = arr[i];
                j++;
            }

            for (int i = 0; i < k; i++) {
                temp[j] = arr[i];
                j++;
            }

            // Copy temp back
            for (int i = 0; i < n; i++) {
                arr[i] = temp[i];
            }
        }
    }


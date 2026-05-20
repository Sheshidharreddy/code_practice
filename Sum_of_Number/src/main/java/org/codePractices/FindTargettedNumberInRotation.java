package org.codePractices;

public class FindTargettedNumberInRotation {
        //conver temperature from celsius to fahrenheit
        public static void main(String[] args) {

            FindTargettedNumberInRotation mainApp = new FindTargettedNumberInRotation();

            int result = mainApp.searchArray(new int[]{1,2,3,4,5,6}, 3);
            System.out.println("result " +result);
        }

        public int searchArray(int[] arr, int target){
            int left = 0;
            int right = arr.length - 1;

            while(left <= right){
                int mid = left +(right + left )/ 2;
                if(arr[mid] == target) {
                    return mid;
                }else if(target > arr[left]){
                    left = mid;
                }else {
                    right = mid;
                }
            }
            return -1;
        }
}

package org.codePractices;

public class ProductOfArrayNumberExpectIIndez {

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        ProductOfArrayNumberExpectIIndez mainApp = new ProductOfArrayNumberExpectIIndez();
        int[] result = mainApp.productExceptSelf(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1 ; i < nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        int suffixProduct = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
    }
        return result;
    }
}

package com.leetcode.code75;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/

import java.util.Arrays;

public class Product_Of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums) {
        /*int[] resultArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j)
                    continue;
                product *= nums[j];
            }
            resultArr[i] = product;
        }
        return resultArr;*/

        // 2nd Way

        int[] resultArr = new int[nums.length];
        int product = 1;
        for(int data: nums){
            product *= data;
        }

        for(int i = 0; i < resultArr.length; i++){
            if(nums[i] == 0)
                resultArr[i] = 0;
            else
                resultArr[i] = product / nums[i];
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(Product_Of_Array_Except_Self.productExceptSelf(array)));
    }

}

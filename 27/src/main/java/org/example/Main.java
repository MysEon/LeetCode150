package org.example;

import java.util.Arrays;

//27题 移除元素
public class Main {
    public int removeElement(int[] nums, int val) {
        var result=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val) result++;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (nums[i]==val){
                    if (nums[i1]!=val) {
                        int temp=nums[i1];
                        nums[i1]=nums[i];
                        nums[i]=temp;
                    }
                }
            }
        }
        return nums.length-result;
    }
    public static void main(String[] args) {
//        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] ints = {3,2,2,3};
        new Main().removeElement(ints,3);
        System.out.println(Arrays.toString(ints));
    }
}
package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

//88题 合并两个有序数组
public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length<nums2.length) return;
        if (nums1.length==nums2.length) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
            return;
        }
        int y=0;
        for (int i =nums1.length-1;i>m-1;i--) {
            nums1[i]=nums2[y];
            y++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Main main1 = new Main();
        int[] ints1 = {-1,0,0,3,3,3,0,0,0};
        int[] ints2 = {2,5,6};
        main1.merge(ints1,6,ints2,3);
        System.out.println(Arrays.toString(ints1));
    }

}



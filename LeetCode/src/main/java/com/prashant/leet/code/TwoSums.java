package com.prashant.leet.code;

import java.util.Arrays;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int cnt1=0; cnt1< nums.length; cnt1++) {
            int remaining = target - nums[cnt1];
            for (int cnt2=cnt1+1; cnt2< nums.length; cnt2++) {
                if(nums[cnt2] == remaining) {
                    sum[0] = cnt1;
                    sum[1] = cnt2;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSum(nums, 26)));
    }
}

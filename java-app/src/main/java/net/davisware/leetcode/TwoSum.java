package net.davisware.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    /*
    Sample data
    [2,7,11,15]
    9
    [3,2,4]
    6
    [3,3]
    6
     */
    public TwoSum() {

    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[nums.length];
        int tmp = 0;
        int tmpIdx = 0;

        for (int x = 0; x < nums.length; x++) {
            int cur = nums[x];
            for (int p = x; p < nums.length; p++) {
                if (cur + nums[p] == target) {
                    
                }
            }
        }


        return result;
    }
}

package net.davisware.leetcode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TwoSum {
    /*
	Given an array of integers nums and an integer target, return indices 
	of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and 
	you may not use the same element twice.

	You can return the answer in any order.

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
        Hashtable workHash = new Hashtable();

        for (int x = 0; x < nums.length; x++) {
            workHash.put(x, nums[x]);
        }

        for (int y = 0; y < workHash.size();  y++) {
            System.out.println("workHash["+y+"] = " + workHash.get(y));
        }



        return result;
    }
}

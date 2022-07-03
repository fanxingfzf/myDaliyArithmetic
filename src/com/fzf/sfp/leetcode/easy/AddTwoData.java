package com.fzf.sfp.leetcode.easy;

/**
 * 1. 两数之和
 * @author fanZhiFei
 * @create 2022/7/3
 */
public class AddTwoData {
    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

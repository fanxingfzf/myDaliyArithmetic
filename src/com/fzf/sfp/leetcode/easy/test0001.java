package com.fzf.sfp.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * @author fanZhiFei
 * @create 2022/7/3
 */
public class test0001 {
    /**
     * 方法一：暴力枚举
     * 时间复杂度：O(N^2)
     * 空间复杂度：O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
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

    /**
     * 哈希映射
     * 时间复杂度：O(N)
     * 空间复杂度：O(N)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums,int target){
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int target=6;

        /*int[] ints = twoSum(nums, target);
        for (int i:ints
             ) {
            System.out.println(i);
        }*/

        int[] ints = twoSum2(nums, target);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }

}

package com.example.demo.leecode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 Two Sum
 Description
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 Tags: Array, Hash Table

 题意是让你从给定的数组中找到两个元素的和为指定值的两个索引，最容易的当然是循环两次，复杂度为 O(n^2)，首次提交居然是 2ms，打败了 100% 的提交，谜一样的结果，之后再次提交就再也没跑到过 2ms 了。

 利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，比如 i = 0 时，此时首先要判断 nums[0] = 2 是否在 map 中，如果不存在，那么插入键值对 key = 9 - 2 = 7, value = 0，之后当 i = 1 时，此时判断 nums[1] = 7 已存在于 map 中，那么取出该 value = 0 作为第一个返回值，当前 i 作为第二个返回值，具体代码如下所示。
 */
public class TwoSum {

    public static void main(String[] args) {
        int target = 9;
        int [] ints = new int[] {1, 2, 7, 2, 15};

        int [] targets = twoSum(ints, target);
        System.out.println("[" + targets[0] + " ," + targets[1] + "]");

        int [] targetsHash = twoSumHash(ints, target);
        System.out.println("[" + targetsHash[0] + " ," + targetsHash[1] + "]");

    }

    public static int [] twoSum(int[] ints, int target) {
        for (int i = 0; i < ints.length ; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if ( (ints[i] < 9) | (ints[j] < 9) ) {
                    if (ints[i] + ints[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    //优化
    public static int[] twoSumHash(int[] ints, int target) {
        Map<Integer, Integer> map = new HashMap<>(ints.length);
        for (int i = 0; i < ints.length; i++) {
            if (map.containsKey(ints[i])) {
                return new int[]{map.get(ints[i]), i};
            } else {
                map.put(target - ints[i], i);
            }
        }
        return null;
    }

}

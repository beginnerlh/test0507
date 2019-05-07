/*
给定两个数组，编写一个函数来计算它们的交集。

示例 1:
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]

示例 2:
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]
*/
package lianxi0507;

import java.util.ArrayList;
import java.util.Arrays;

public class test0507 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = { 4, 9, 5};
        int[] nums2 = { 8, 9, 4, 6, 4};
        int[] arr = s.intersect(nums1,nums2);
        System.out.println(Arrays.toString(arr));

    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }
}

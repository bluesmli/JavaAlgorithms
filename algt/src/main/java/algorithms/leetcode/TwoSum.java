package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


  /*  1. 两数之和 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

    示例:
    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]*/


    /**
     * 通过map查找
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumByMap(int[] nums, int target) {
        Map<Integer,Integer> hashmap=new HashMap<Integer, Integer>();
        for (int i = 0; i <nums.length ; i++) {
            int temp = target-nums[i];
            if(hashmap.containsKey(temp)){
                return new int[] {hashmap.get(temp),i};
            }else {
                hashmap.put(nums[i],i);
            }

        }
        return null;
    }


    /**
     * 通过双层遍历查找
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumBySort(int[] nums, int target) {

        for (int i = 0; i <nums.length ; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }












    public static void main(String[] args) {
        int [] a=new TwoSum().twoSumByMap(new int[]{1,2,4,5,7,8,88},9);
        //int [] a=new TwoSum().twoSumBySort(new int[]{0,2,4,5,6,8,88},9);
        for (int i :a) {
            System.out.println(i);
        }
    }
}
package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

/*
    给定⼀个数组 nums 和⼀个数值 val，将数组中所有等于 val 的元素删除，并返回剩余的元素个数。
*/

    public  static int removeElement(int [] nums,int val){
        List<Integer> linums=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                linums.add(i);
            }
        }
        return linums.size();
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }
}

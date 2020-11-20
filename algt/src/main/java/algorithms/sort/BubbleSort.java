package algorithms.sort;

public class BubbleSort {

    /*冒泡排序*/

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public  static  int [] ArrayBubbleSort(int [] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    //交换
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums=ArrayBubbleSort(new int[]{10,5,6,9,4});
        for (int i:nums
             ) {
            System.out.println(i);
        }
    }


}

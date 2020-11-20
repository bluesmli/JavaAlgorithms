package algorithms.sort;

public class SelectionSort {
    /**
     * 选择排序-先设定最小值，然后在用剩下的序列中选出最小值，如果比当前最小值小则交换
     * @param nums
     */
    public static int[] selectSort(int [] nums){
        for (int i = 0; i <nums.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            if (i != min) {
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
            }
            
        }

        return nums;


    }

    public static void main(String[] args) {
       int[] nums= selectSort(new int[]{1,5,8,2,5,9});
        for (int i :nums) {
            System.out.println(i);
        }
    }
}

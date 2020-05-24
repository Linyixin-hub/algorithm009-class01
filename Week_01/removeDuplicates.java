class Solution {
    public int removeDuplicates(int[] nums) {
     //删除重复想，双指针循环方法
    
    if(nums == null || nums.length == 0) return 0;
    int p = 0;
    int q = 1;
    while(q < nums.length){
        if(nums[p] != nums[q]){
            nums[p + 1] = nums[q];
            p++;
        }
        q++;
    }
    return p + 1;
  }
}
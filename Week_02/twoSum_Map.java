class Solution {
    /***
    **从哈希算法
    **解题思路：使用map存放数组，求解target转换成求解target-a在map中是否存在。
    **/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){ 
                //直接使用map的contains判断
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
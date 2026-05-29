class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int nums_length = nums.length;
        for(int i = 0; i < nums_length; i++){
                int difference = target - nums[i]; 
                for(int j = i + 1; j < nums_length; j++){
                        if(nums[j] == difference){
                                res[0] = i;
                                res[1] = j;
                                return res;
                        }
                }
        }
    return res;
    }
 
}

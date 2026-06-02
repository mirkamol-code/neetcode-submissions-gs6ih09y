class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] == 0) break;
                temp++;
            }
            res = Math.max(temp, res);
        }
        return res;
    }
}
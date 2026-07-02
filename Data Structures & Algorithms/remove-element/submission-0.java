class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == val){
              for(int index = i+1;  index < n; index++){
                nums[index-1] = nums[index];
              }
              i--; // Re-check current index
              n--; // Reduce effective length
            }else{
                count++;
            }
        }
        return count;
    }
}
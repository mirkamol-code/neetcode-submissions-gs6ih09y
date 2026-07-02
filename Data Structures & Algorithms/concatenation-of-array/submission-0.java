class Solution {
    public int[] getConcatenation(int[] nums) {
        int capacity = nums.length;
        capacity = 2 * capacity;
        int[] ans = new int[capacity];
        int index = 0;
        for(int i = 0; i < ans.length; i++){
            if(index == nums.length){
                index = 0;
            }
            ans[i] = nums[index];
            index++;
        }
        
        return ans;
    }
}
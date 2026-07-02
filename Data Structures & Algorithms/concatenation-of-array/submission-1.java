class Solution {
    public int[] getConcatenation(int[] nums) {
        int capacity = 2 * nums.length;
        int[] ans = new int[capacity];
        int limit = 0;
        for(int i = 0; i < ans.length; i++){
            if(limit == nums.length){
                limit = 0;
            }
            ans[i] = nums[limit];
            limit++;
        }
        
        return ans;
    }
}
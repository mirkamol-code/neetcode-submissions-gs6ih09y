class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> distinctNumbers = new HashSet<Integer>();
        for(int number : nums){
            if(distinctNumbers.contains(number)){
                return true;
            }
            distinctNumbers.add(number);
        }
        return false;
    }
}
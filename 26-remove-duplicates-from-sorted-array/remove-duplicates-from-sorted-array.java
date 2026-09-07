class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectednums = new int [nums.length];
        int j = 0 ;
        expectednums[0] = nums[0];
        
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0 ; i < nums.length ; i ++){
            if (nums [i]== expectednums[j]){
                continue;
            }
            else {
                ++j ;
                expectednums[j]= nums[i];
            }
        }
        for (int h = 0 ; h < nums.length ; h ++){
            nums[h]= expectednums[h];
        }
    return j+1;
    }
}
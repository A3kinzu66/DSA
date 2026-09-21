class Solution {
    public int majorityElement(int[] nums) {
     int can = nums[0];
     int count = 1 ;
     for (int i = 1; i < nums.length ; i++){
        if (nums[i]==can){
            count++;
        }
        else count-- ; 

      
    if (count==0){
        can = nums[i];
        count = 1 ;

    }
    
     }
     return can ; 
    }
}
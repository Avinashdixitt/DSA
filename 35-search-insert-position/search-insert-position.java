class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int avg=(s+e)/2;
        if (target<nums[0])
        return 0;
        
        while(s<=e){
            avg=s+(e-s)/2;
            if (nums[avg]==target)
            return avg;
            else if(nums[avg]>target)
            e=avg-1;
            else
            s=avg+1;
        }

        
        return s;
        
        
        
    }
}
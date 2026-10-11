class Solution {
    public int maxArea(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int max  = Integer.MIN_VALUE;
        while( low < high){
            int b = high - low;
            int h = Math.min(nums[low], nums[high]);
            int area = b * h;
            max = Math.max(max, area);

            if(nums[low] < nums[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}
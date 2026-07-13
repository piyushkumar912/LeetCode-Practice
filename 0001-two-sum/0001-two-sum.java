class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
         // Traverse each element
        for(int i = 0; i<n; i++){
         // Check every element after i
            for(int j = i + 1; j<n;j++){
         // If the pair sum equals the target
                if(nums[i] + nums[j] == target){
         // Return the indices of the two numbers
                    return new int[]{i,j};
                }
            }
        }
        // Return an empty array if no pair is found
        return new int[]{};
    }
}

//Time: O(n²)
//Space: O(1)
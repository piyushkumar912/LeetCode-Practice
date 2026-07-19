class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
          if (k == 0) {
            return n;
          }
          int ul = nums[n-k];
          int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < ul) {
                count++;
            }
        }

        return count;     
    }
}



//arr: {5,4,1,2,3,4,7}; check kine elements hai array me jo k se chote hai;
//sort: {1,2,3,4,4,5,7}; k =3; n= 7-3= 4:
//arr: sort : arr[n-k] se chote values will be the ans

//Time: O(n log n)
//Space: O(1)
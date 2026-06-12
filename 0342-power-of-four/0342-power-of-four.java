class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n % 4 == 0){
                n = n / 4;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

// A power of 4 can be repeatedly divided by 4 until it becomes 1.
// Time Complexity O(log₄ n)
// Space Complexity O(1)
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n % 3 == 0){
                n = n / 3;
            }
            else{
                    return false;
                }
        }
        return true;
    }
}


//Agar koi number power of 3 hai, to usse baar-baar 3 se divide karne par finally 1 mil jayega.
//Time Complexity: O(log₃ n)
//Space Complexity: O(1)
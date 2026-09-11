class Solution {
    public int climbStairs(int n) {
        // If n is 1 or 2, answer is directly n
        if(n == 1 || n == 2){
            return n;
        }
        int a = 0;     // Previous value
        int b = 1;    // Current value
        int sum = 0; // Next value
        for(int i =1; i <= n; i++){
    // Add previous and current to get next
            sum = a+b;
            a = b;   // ← previous
            b = sum; // ← current
        }
        return sum;  // final answer
    }
}


// Previous  + Current =  Next
//   1     +    2       =  3 
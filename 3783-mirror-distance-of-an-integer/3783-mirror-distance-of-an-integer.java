class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;               // Get the last digit
            reverse = reverse * 10 + digit;  // Add the digit to the reversed number
            n /= 10;                        // Remove the last digit from n

        }
        return Math.abs(original - reverse); // RETURN DIFFERENCE BETWEEN ORIGINAL AND REVERSE 
    }
}

// Time Complexity  → O(log n)
// Space Complexity → O(1)



// Extract last digit using % 10
// Remove last digit using / 10
// Build reverse using reverse * 10 + digit
// Find mirror distance using Math.abs(original - reverse)
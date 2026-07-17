class Solution {
    public int firstMatchingIndex(String s) {
        // Length of the string
        int n = s.length();
        // Traverse from the beginning
        for (int i = 0; i < n; i++) {
            // Compare characters from both ends
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                // Return the first matching index
                return i;
            }
        }
        // No matching index found
        return -1;
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)
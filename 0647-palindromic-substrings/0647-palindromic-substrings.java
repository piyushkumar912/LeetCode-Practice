class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            //For ODD
            int low = i;
            int high = i;
            while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                count++;
            }
            // For EVEN
            int low1 = i;
            int high1 = i+1;
             while(low1 >= 0 && high1 < n && s.charAt(low1) == s.charAt(high1)){
                low1--;
                high1++;
                count++;
            }
        }
        return count;
    }
}
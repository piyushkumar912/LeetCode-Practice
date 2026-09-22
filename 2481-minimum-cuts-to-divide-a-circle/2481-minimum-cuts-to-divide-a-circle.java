class Solution {
    public int numberOfCuts(int n) {
        // If there is only 1 slice, no cut is needed
        if(n == 1){
            return 0;
        }
        // If n is even, each cut through the center
        // creates 2 equal slices
        if(n % 2 == 0){
            return n/2;
        }
        // If n is odd (and greater than 1),
        // we need n cuts to make n equal slices
        else{
            return n;
        }
    }
}


// --> CONCEPT --> The main concept is very simple: we need to think about how many equal slices one straight cut can create.

// n = 1       → 0 cuts
// n = even    → n / 2 cuts
// n = odd     → n cuts


// T.C =O(1)
// S.C = O(1)
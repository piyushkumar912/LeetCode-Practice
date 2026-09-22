class Solution {
    public int differenceOfSums(int n, int m) {
        int d = 0;
        int nd = 0;
        for(int i = 1; i<=n; i++){
            if(i % m == 0){
                d = d + i;
            }
            else{
                nd = nd + i;
            }
        }
        return nd - d;
    }
}


// T.C = O(n)
// S.P = O(1)



// 💡 Concept

// 1 se n tak har number check karo:

// Agar i % m == 0 → divisible, so num2 me add
// Otherwise → non-divisible, so num1 me add
// Finally return num1 - num2
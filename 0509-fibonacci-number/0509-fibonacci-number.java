class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2; i<=n; i++){
            sum = a + b;
            a = b;    // previous fibonacci
            b = sum;  // current fibonacci
        }
        return sum;
    }
}


// for fibonacci har pichhlr do number ka sum ko sum krte hai or jo number aata h wahi fibonacci number hoga;
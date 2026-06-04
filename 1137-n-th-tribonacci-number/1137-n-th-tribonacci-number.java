class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = 0;
        for(int i = 3; i<=n; i++){
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;   //Current Tribonacci Number
        }
        return sum;
    }
}


//Isme hm privious three number ka sum ko add krte hai wahi mera Tribonacci Number hota hai
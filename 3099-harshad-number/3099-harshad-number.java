class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original = x;
        int sum = 0;
         // Sum of digits
        while(x > 0){
            int digit = x % 10;
            sum += digit;
            x /= 10;
        }
          // Check Harshad Number
        if(original % sum == 0){
            return sum;
        }
        return -1;
    }
}
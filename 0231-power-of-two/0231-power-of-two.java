class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

//Agar 2 se  kisi number ko repeatedly divide krne se jb tk one aa jaye oo power of 2 hai number..EX-16; 
//Agar bich me koi odd number aa jaye one aane se phle oo power of 2 nhi hai..EX-12;


//T.C= o(logn);
//S.C= o(1);
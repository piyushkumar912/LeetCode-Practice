class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0;
        //first window
        for(int i =0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }
        int ans = white;
        //sliding window
        for(int i = k; i < blocks.length(); i++){
            //New character enters window
            if(blocks.charAt(i) == 'W'){
                white++;
            } 
            //old character leaves woindow
            if(blocks.charAt(i - k) == 'W'){
                white--;
            }
            ans = Math.min(ans, white);
        }
        return ans;
    }
}

//Time: O(n)
//Space: O(1)

//Concept :-> Isme jitne k diye hue hai utne consecutive black bnana hai agar black nhi h to white jitne time target ko pure krne ya black ko bnane me operation lagenge utne count kr ke return kr dena hai..
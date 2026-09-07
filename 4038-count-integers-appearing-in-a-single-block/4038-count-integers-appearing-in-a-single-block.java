class Solution {
    public int countSpecialIntegers(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        //Array ke elements map me dalo
        for(int num : nums){
            map.put(num, 0);
        }
         
        //Har key ke blocks count krenge 
        for(int key : map.keySet()){
            boolean check = true;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] == key){
               while(i + 1 < nums.length && nums[i + 1] == key){
                i++;
               }
               //key ka ek complete block mil gaya
               map.put(key, map.get(key) + 1);
        }
    }
}
           int count = 0;
           for(int key : map.keySet()){
             if(map.get(key) == 1){
               count++;
            }
      }
            return count;
    }
}
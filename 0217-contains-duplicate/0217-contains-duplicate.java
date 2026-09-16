import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // HashSet banaya duplicate track karne ke liye
        HashSet<Integer> set = new HashSet<>();
        
        // Array ke har element pe loop chala rahe hain
        for(int ele : nums){
            
            // Check: kya ye element pehle se set me hai?
            if(set.contains(ele)) {
                return true; // Agar hai → duplicate mil gaya
            }
            
            // Agar nahi hai → set me add kar do future check ke liye
            set.add(ele);
        }
        
        // Agar pura array check ho gaya aur duplicate nahi mila
        return false;
    }  
}

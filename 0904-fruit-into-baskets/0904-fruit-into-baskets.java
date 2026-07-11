class Solution {
    public int totalFruit(int[] fruits) {
         // Stores each fruit type and its count in the current window
        HashMap<Integer , Integer> map  = new HashMap<>();
        int n = fruits.length;
        int left = 0; // Left pointer of the sliding window
        int max = 0; // Stores the maximum number of fruits collected
        // Expand the window by moving the right pointer
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
              // If more than 2 fruit types are present,
            // shrink the window from the left
            while(map.size() > 2){
          // Decrease the count of the leftmost fruit
             map.put(fruits[left],map.get(fruits[left])-1);
         // Remove the fruit type if its count becomes 0
             if(map.get(fruits[left])==0){
                map.remove(fruits[left]);
            }
            // Move the left pointer forward
            left++;
            }
            // Update the maximum window size
            max = Math.max(max, right-left+1);
        }
         // Return the maximum number of fruits collected
         return max;
    }
}

//Time: O(n)
//Space: O(1) (the map holds at most 3 fruit types temporarily before shrinking)